package 도형;

public class Rect extends Shape implements Drawable, Moveable {
	
	private int h;
	public Rect(int w, int h) {
		super(w);
		this.h = h;
	}
	
	public void area() {
		result = w * h;
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
