package 클래스;

public class CalcStaticTest {

	public static void main(String[] args) {
		
		//정적멤버는 클래스 이름으로 접근
		//클래스 이름으로 접근
		//CalcStatic.PI = 3.141592;
		System.out.println(CalcStatic.PI);
		System.out.println(CalcStatic.add(10, 20));
		
		CalcStatic c1 = new CalcStatic();
		CalcStatic c2 = new CalcStatic();	
		System.out.println(c1);
		System.out.println(c2);

	}

}
