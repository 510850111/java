package 单元项目_简易绘图;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


public class Server {
	private ArrayList<Shape> list;
	private Shape current;
	
	public Server(){
		list = new ArrayList<>();
	}
	
	public void create(String name) {
		ShapeType type = ShapeType.valueOf(name);
		current = ShapeFactory.create(type);
	}
	
	public void add(){
		list.add(current);
	}
	
	public void drawAll(Graphics g){
		for(Shape s : list)
			s.draw(g);
	}
	
	public void drawCurrent(Graphics g) {
		current.draw(g);	
	}
	
	public void clearCurrent(Graphics g) {
		if (current.getLast() != null) 
		current.clear(g);
		
	}
	
	public void setFirst(Point pt) {
		current.setFirst(pt);
	}
	public void setLast(Point pt) {
		current.setLast(pt);
		
	}
	public void setFore(Color c){
		current.setFore(c);
	}
	
}
