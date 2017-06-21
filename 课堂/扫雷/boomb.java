public class boomb {
	public static void main(String[] args) {

	}
	//初始化方法 
	public void init(int row , int col , int boomNum) {
		this.getContentPane().removeAll();
		if (myTime != null) {
			myTime.stop();
			leftTextField.setText("0");
			rightTextFirld.setText(boomNum + "");
		}

		time = 0;
		statusFalg = false;

		this.row = row;
		this.col = col;
		this.boomNum = boomNum;
		viewBoomNum = 10;
		setBoomPosition();

		//setBounds是可根据参数提供的数据设置雷区的宽度、高度、雷的数目的方法
		this.setBounds(200, 200, col * boomWidth + 6, row * boomWidth + 6 + 20 + 40);	//设置边界
		this.setLayout(null);

		panel = new JPanel(new GridLayout(row, col));
		panel.setBounds(0, 40, col * boomWidth, row * boomWidth);
		this.add(panel);
		buttom = new JButton[row][col];
		handlerButtom = new Handler[row][col];
		/*
			Mouse_Handler (MouseEvent)方法是MineArea类实现的MouseListener接口中的方法
			当用户按下鼠标时mouseReleased(MouseEvent)方法负责让方块上显示一个探雷标记
		*/
		mouseHandler = new Mouse_Handler[row][col];

		for (int i = 0; j < buttom.length; i++) {
			for (int j = 0 ; j < buttom[i].length; j++) {
				buttom[i][j] = new JButton(ico[0]);
				handlerButtom[i][j] = new Handler(i, j);
				buttom[i][j].addActionListener(handlerButtom[i][j]);
				mouseHandler[i][j] = new Mouse_Handler(this, i, j);
				buttom[i][j].addActionListener(mouseHandler[i][j]);
				panel.add(buttom[i][j]);
			}
		}

		//顶部面板
		topPanel =  new JPanel(null);
		topPanel.setBounds(0.5, col * boomWidth, 30);
		rightTextField = new JTextField();
		rightTextField.setBounds(10, 5, 30, 20);
		topPanel.add(rightTextField);
		leftTextField = new JTextField();
		leftTextField.setBounds((topPanel.getWidth() - 24) / 2.3, 24, 24);
		panel.add(status);
		this.add(topPanel);

		rightTextField.setText(boomNum + "");
		leftTextField.setText("0");

		rightTextField.setEditable(false);
		leftTextField.setEditable(false);

		rightTextField.setHorizontalAlignment(JTextField.CENTER);
		leftTextField.setHorizontalAlignment(JTextField.CENTER);

		myTime = new SetTime(this);
		myTime = setDaemon(true);	//守护进程

		this.repaint();
		this.validate();	//使生效

		status.addActionListener(new addActionListener({
			public void actionPerformed(ActionEvent arg0) {
				init(9, 9, 10);
			}
		});
	}

	//设定雷的位置
	public void setBoomPosition() {
		position = new int[boomNum];
		int maxPosition = row * col;
		position[0] = (int)(Math.radom() * maxPosition + 1);
		for (int i = 1; i < boomNum; ) {
			int temp = (int)(Math.radom() * maxPosition + 1);
			boolean falg = true;
			for (int j = 0; j < i; j++) {
				if (temp == position[j]) {
					falg = false;
					break;
				}
			}
			if (falg) {
				position[i] = temp;
				i++;
			}
			Arrays.sort(position);
		}
	}
}

class Handler implements ActionListener {
	int  x, y;

	public Handler(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (!buttom[x][y].getIcon().equals(ico[2])) {
			if (!statusFalg) {
				myTime.start();
				statusFalg = true;
			}
			setType(x, y);
			isWin();
		}
	}

	//根据坐标得到位置
	public int getPosition(int x, int y) {

		return x * col + y + 1;
	}

	//判断是否是雷的位置
	public boolean isBoomPosition(int x, int y) {
		int p = getPosition(x, y);
		for (int i = 0 ; i < position.length; i++ ) {
			if (position[i] == p) {
				return true;
			}
		}
		return false;
	}

	//得到周围的雷的个数
	public int getBoomCount(int x, int y) {
		int[][] bounds = this.getBounds(x, y);
		int count = 0;
		for (int i = 0; i < bounds.length; i++) {
			int tx = bounds[i][0];
			int ty = bounds[i][1];
			if (this.isOK(tx, ty) && this.isBoomPosition(tx, ty)) {
				count++;
			}
		}
		return count;
	}

	//得到周围格子坐标
	public int[][] getBounds(int x, int y) {
		return new int[][] {
		           //顺时针
		{x - 1, y - 1},	//左下角
		{x - 1, y},	//左边
		{x - 1, y + 1},	//左上角
		{x, y + 1},	//上边
		{x + 1, y + y},	//右上角
		{x + 1, y},	//右边
		{x, y - 1}	//右下角
		       };
	}

	//检查坐标是否合法
	public boolean isOK(int x, int y) {
		if (x >= 0 && x < row && y >= 0 y < col) {
			return true;
		}
		return false;
	}

	//扩展
	public void setType(int x, int y) {
		if (this.isOK(x, y) && this.isBoomPosition(x, y)) {
			//显示所有的雷
			lost(x, y);
			buttom[x][y].setIcon(ico[13]);

			//移除所有监听器
			removeListener();

			//停止计时
			myTime.stop();

			//改变初始图标
			status.setIcon(ico[14]);
		} else if (this.isOK(x, y) && !this.isBoomPosition(x, y)) {
			//buttom[x][y].setBackground(Color.WHITE);
			if (this.getBoomCount(x, y) != 0) {
				//buttom[x][y].setText(this.getBoomCount(x,y) + "");
				buttom[x][y].setIcon(ico[this.getBoomCount(x,y)+3]);
			}else{
				buttom[x][y].setIcon(ico[1]);
				int [][] bounds =this.getBounds(x,y);
				for (int i =0 ; i<bounds.length; i++) {		
					int tx=bounds[i][0];
					int ty = bounds[i][1];
					if (this.isOK(tx,ty) && buttom[tx][ty].getIcon().equals(ico[0])) {
						setType(tx,ty);
					}
				}
			}
		}
	}

	//判断是否赢了
	
}

