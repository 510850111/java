/*
	需求:我准备写一个Java程序,把"HelloWorld"输出在控制台
	
	分析:
		A:要写一个Java程序,必须要定义一个类
		B:要使得程序独立运行,必须定义main方法
		C:要使得"HelloWorld"输出在控制台,必须要使用输出语句
	
	实现:
		A:class用于定义类,后面跟的是类名
		B:mian方法的格式是固定的:	
			public static void main(String[] args){}
		C:输出语句是固定的:
			System.out.println("HelloWorld");
			"HelloWorld"是可以改变的
*/

//这是我的HelloWorld案例:

class HelloWorld{
	/*为了程序能够运行,定义main方法
	   main方法是程序的入口
	   它能够被jvm自动调用
	*/
	public static void main(String[] args){
		System.out.println("HelloWorld!");
	}
}




