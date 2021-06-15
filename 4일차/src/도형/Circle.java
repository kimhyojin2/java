package 도형;

public class Circle extends Shape implements Drawable, Moveable {

	public Circle(int w) {
		super(w);
		//this.w = w;
	}
	public void area() {
		result = w * w * 3.14;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
		

}
