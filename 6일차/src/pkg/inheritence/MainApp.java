package pkg.inheritence;

public class MainApp {

	public static void main(String[] args) {
		
		A a = new D();             //자동형변환
		int temp = ((D)a).sd;      //강제형변환(D로 캐스팅해야 접근가능) p.348
		
		A o = new A();
		temp = ((D)o).sd;         // run time 오류
		
		//a = new B();
		//a = new D();
		
		//A b = new D();
		//Y x = new D();
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof X);
		
		B b = new B();
		b = new D();
		// b = new C();   //부모 자식 아니고 형제 관계라서 불가능

	}

}
