
public abstract class Circle extends Shape{

	private double raduis;

	public double getRaduis() {
		return raduis;
	}
	public double getRaduis(boolean flag) {
		if(flag==false){
			return raduis*10;
		}
		return raduis;
	}

	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	
	abstract public double getArea();
	
}
