class phoneFuncation {
	//品牌
	String brand;
	//颜色
	String color;
	//价格
	int price;

	//打电话的方法
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}

	//发短信的方法
	public void message() {
		System.out.println("群发短信");
	}

	//打游戏的方法
	public void playGame(String gameName) {
		System.out.println("玩" + gameName + "这个游戏");
	}
}

public class Phone {
	public static void main(String[] args) {
		phoneFuncation p = new phoneFuncation();

		p.brand = "华为";
		p.color  = "黑色";
		p.price = 1000;

		System.out.println(p.brand + "-----" + p.color + "-----" + p.price);
		p.call("孙燕姿");
		p.message();
		p.playGame("神庙逃亡");
	}
}

