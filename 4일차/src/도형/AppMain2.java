package 도형;

public class AppMain2 {

	public static void main(String[] args) {
		
		Shape s = new Rect(4,5); //부모타입 자식객체 참조가능
		execute(s);
		
		Circle s1 = new Circle(4);
		execute(s1);

	}
//	public static void execute(Rect s) {
//		if(s instanceof Drawable) {
//			((Drawable)s).draw();
//		}
//		s.move();
//		s.area();
//	}
	public static void execute(Shape s) {
		s.area();             //다형성 : 참조대상의 메서드호출 -> 실행결과가 다르게
		if (s instanceof Moveable) {
			((Moveable)s).move();     //강제형변환
		}

	}

}
