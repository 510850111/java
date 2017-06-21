public class quarts1 {
	//计算长方形面积
	private int width;		//宽
	private int height;	//高
	 
	 //长方形面积
	 public quarts1(int width ,int height){
		 this.width = width;
		 this.height = height;
	 }
	 
	 //正方形面积
	 public quarts1(int lengthOfASide){
		 this.width = lengthOfASide;
		 this.height = lengthOfASide;
	 }
	 
	 //计算面积
	 public int area(){
		 return width * height;
	 }
	 
	 //计算周长
	 
	 public int perimeerter(){
		 return (width + height) * 2;
	 }
}
