
public class ShapeFactory {
	private static Shape[] shapes;
	
	static{  //��̬���췽������̬��ʼ����
		shapes = new Shape[5];
		int i = 0;  
		shapes[i++] = new RectShape();
		shapes[i++] = new OvalShape();
		shapes[i++] = new RectRoundShape();
		shapes[i++] = new RightAngleShape();
		shapes[i++] = new LineShape();
	
	}
	
	public static Shape create(ShapeType t) {
		Shape ret = null;
		try {
			ret = (Shape)(shapes[t.ordinal()].clone());
		} catch (Exception e) {}
		return ret;
		
	}
}
