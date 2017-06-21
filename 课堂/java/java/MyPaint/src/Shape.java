import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public abstract class Shape implements Cloneable {
	private Point first;
	private Point last;
	private Color fore = Color.BLACK;
	private Color back = Color.WHITE;
	
	public abstract void draw(Graphics g);
	public abstract void clear(Graphics g);
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public int getWidth(){
		return Math.abs(last.x - first.x);
	}
	
	public int getHight(){
		return Math.abs(last.y - first.y);
	}
	
	public Point getLeftTop(){
		int x = Math.min(first.x, last.x);
		int y = Math.min(first.y, last.y);
		return new Point(x, y);
	}
	
	public Point getFirst() {
		return first;
	}
	public void setFirst(Point first) {
		this.first = first;
	}
	public Point getLast() {
		return last;
	}
	public void setLast(Point last) {
		this.last = last;
	}

	public Color getFore() {
		return fore;
	}
	public void setFore(Color fore) {
		this.fore = fore;
	}
	public Color getBack() {
		return back;
	}
	public void setBack(Color back) {
		this.back = back;
	}
	
}
