package me.hekuan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Oscar
 */
@SuppressWarnings("serial")

/**
 *�������,�ܹ�������ɫ,�ٶȺ��Ƿ�������ȹ���
 * @author Oscar
 */
public class ControlPanel extends javax.swing.JFrame {

	GamePanel gamePanel = new GamePanel();
	Snake snake = new Snake();
	Food food = new Food();
	
    public ControlPanel() {
        initComponents();
        init();
    }
    
    /**
     * ���ÿ������ĸ�������
     */
    private void init() {
//		jSliderControlSpeed = new javax.swing.JSlider(100, 1200);
		snake.isPause = true;
		this.setTitle("̰�Կ������");
		this.setResizable(false);
		UI.setJFrameLocateCenter(this);
		//��ȡĬ��ֵ
		jSliderControlSpeed.setValue((int) Snake.millis);
		jSliderControlSpeed.setValue((int) jSpinner.getValue());
	}
                
    private void initComponents() {

        jButtonSetSnakeBodyColor = new javax.swing.JButton();
        jButtonSetSnakeHeadColor = new javax.swing.JButton();
        jButtonSetBgColor = new javax.swing.JButton();
        jButtonSetFoodColor = new javax.swing.JButton();
        jCheckBoxShowTableLine = new javax.swing.JCheckBox();
        jButtonReSet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSliderControlSpeed = new javax.swing.JSlider(SwingConstants.HORIZONTAL ,50,1000,100);
		jSpinner = new javax.swing.JSpinner(new SpinnerNumberModel(jSliderControlSpeed.getValue(), jSliderControlSpeed.getMinimum(), jSliderControlSpeed.getMaximum(), 1));

        jButtonSetGriddingColor = new javax.swing.JButton();
        jButtonSetGroundColor = new javax.swing.JButton();
        jButtonCloseFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSetSnakeBodyColor.setText("����������ɫ");
		jButtonSetSnakeBodyColor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Color bodyColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ���������ɫ", Color.DARK_GRAY);
				Snake.bodyColor = bodyColor;
			}
		});

		jButtonSetSnakeHeadColor.setText("������ͷ��ɫ");
		jButtonSetSnakeHeadColor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Color headColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ����ͷ����ɫ", Color.DARK_GRAY);
				Snake.headColor = headColor;
			}
		});

		jButtonSetBgColor.setText("���ñ�����ɫ");
		jButtonSetBgColor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Color bgColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ�񱳾���ɫ", Color.DARK_GRAY);
				if (bgColor != null) {
					GamePanel.bgColor = bgColor;
				}
			}
		});

		jButtonSetFoodColor.setText("����ʳ����ɫ");
		jButtonSetFoodColor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				Color foodColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ��ʳ�����ɫ", Color.DARK_GRAY);
				Food.foodColor = foodColor;

			}
		});

		jCheckBoxShowTableLine.setText("��ʾ������");
		
		/*�ж��Ƿ��Ѿ�������������ȷ����ѡ���Ƿ�Ҫѡ��*/
		if (Ground.isDrawGridding == true) {
			jCheckBoxShowTableLine.setSelected(true);
		}else {
			jCheckBoxShowTableLine.setSelected(false);
		}
		
		jCheckBoxShowTableLine.addActionListener(new ActionListener() {

			/**
			 * �жϸ�ѡ���Ƿ�ѡ��<BR>
			 * �����,�ͻ�������<br>
			 * �������,�Ͳ���������
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jCheckBoxShowTableLine.isSelected() == true) {
					Ground.isDrawGridding = true;
				} else {
					Ground.isDrawGridding = false;
				}
			}
		});
		
		
		/*
		 * �ָ�Ĭ������
		 * */
		jButtonReSet.setText("�ָ�Ĭ������");
		jButtonReSet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Snake.headColor = Snake.DEFAULT_HEAD_COLOR;
				Snake.bodyColor = Snake.DEFAULT_BODY_COLOR;
				Food.foodColor = Food.DEFAULT_FOOD_COLOR;
				Ground.isDrawGridding = false;
				Ground.rocksColor = Ground.DEFAULT_ROCKS_COLOR;
				Ground.griddingColor = Ground.DEFAULT_GRIDDING_COLOR;
				GamePanel.bgColor = GamePanel.DEFAULT_BACKGROUND_COLOR;
				jCheckBoxShowTableLine.setSelected(false); 
				jSliderControlSpeed.setValue(100);
				jSpinner.setValue(jSliderControlSpeed.getValue());
			}
		});
		
		jLabel1.setText("����ˢ���ٶ�(����)");
		
		//��ת������ʾ��ֵ��Χ.��1000->50
		jSliderControlSpeed.setInverted(true);
		
		//���ƿ̶�
		jSliderControlSpeed.setPaintTicks(true);
		jSliderControlSpeed.setMajorTickSpacing(100);
		jSliderControlSpeed.setMinorTickSpacing(25);
		

		//����̰�����ٶ�
		jSliderControlSpeed.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				Snake.millis = jSliderControlSpeed.getValue();
				jSpinner.setValue(jSliderControlSpeed.getValue());
			}
		});
		
		jSpinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				jSliderControlSpeed.setValue((int) jSpinner.getValue());
				
			}
		});
		
		/*
		 * ����JSpinner����ʹ�÷������ַ�
		 */
		JSpinner.NumberEditor editor = new JSpinner.NumberEditor(jSpinner, "0");
		   jSpinner.setEditor(editor);
		   JFormattedTextField textField = ((JSpinner.NumberEditor) jSpinner.getEditor())
		     .getTextField();
		   textField.setEditable(true);
		   DefaultFormatterFactory factory = (DefaultFormatterFactory) textField
		     .getFormatterFactory();
		   NumberFormatter formatter = (NumberFormatter) factory.getDefaultFormatter();
		   formatter.setAllowsInvalid(true);

        jButtonSetGriddingColor.setText("����������ɫ");
        jButtonSetGriddingColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color griddingColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ���������ɫ", Color.DARK_GRAY);
				if (griddingColor != null) {
					Ground.griddingColor = griddingColor;
				}				
			}
		});
        
        
        jButtonSetGroundColor.setText("����Χǽ��ɫ");
        jButtonSetGroundColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Color rocksColor = JColorChooser.showDialog(ControlPanel.this, "��ѡ��Χǽ����ɫ", Color.DARK_GRAY);
				if (rocksColor != null) {
					Ground.rocksColor = rocksColor;
				}	
				
			}
		});
        
        jButtonCloseFrame.setText("ȷ��");
        jButtonCloseFrame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCloseFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonReSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSetSnakeBodyColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSetBgColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButtonSetGroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSetFoodColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSetSnakeHeadColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSetGriddingColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxShowTableLine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderControlSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonSetBgColor, jButtonSetFoodColor, jButtonSetSnakeHeadColor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetBgColor)
                    .addComponent(jButtonSetFoodColor))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetSnakeBodyColor)
                    .addComponent(jButtonSetSnakeHeadColor))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetGriddingColor)
                    .addComponent(jButtonSetGroundColor))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonReSet)
                    .addComponent(jCheckBoxShowTableLine))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSliderControlSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCloseFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonReSet, jButtonSetGriddingColor, jButtonSetGroundColor, jButtonSetSnakeBodyColor});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSliderControlSpeed, jSpinner});

        pack();
    }// </editor-fold>                        

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	System.out.println("��Ϸ��������Ѿ�����!");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCloseFrame;
    private javax.swing.JButton jButtonReSet;
    private javax.swing.JButton jButtonSetBgColor;
    private javax.swing.JButton jButtonSetFoodColor;
    private javax.swing.JButton jButtonSetGriddingColor;
    private javax.swing.JButton jButtonSetGroundColor;
    private javax.swing.JButton jButtonSetSnakeBodyColor;
    private javax.swing.JButton jButtonSetSnakeHeadColor;
    private javax.swing.JCheckBox jCheckBoxShowTableLine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSliderControlSpeed;
    private javax.swing.JSpinner jSpinner;
    // End of variables declaration                   
}







