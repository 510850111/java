public class quarts1 {
	//���㳤�������
	private int width;		//��
	private int height;	//��
	 
	 //���������
	 public quarts1(int width ,int height){
		 this.width = width;
		 this.height = height;
	 }
	 
	 //���������
	 public quarts1(int lengthOfASide){
		 this.width = lengthOfASide;
		 this.height = lengthOfASide;
	 }
	 
	 //�������
	 public int area(){
		 return width * height;
	 }
	 
	 //�����ܳ�
	 
	 public int perimeerter(){
		 return (width + height) * 2;
	 }
}
