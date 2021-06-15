package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		
		//2 객체생성(인스턴스)
		Car myCar = new Car();
		myCar.company = "기아자동차";
		myCar.maxSpeed = 400;
		myCar.color = "레드";
		System.out.println("제작회사: " + myCar.company);
		System.out.println("스피드: " + myCar.speed);
		
		//생성자
		Car youCar = new Car("르노","SM6","블루");
		System.out.println(youCar);
		
		//"코나, 100"
		Car miniCar = new Car("코나", 100);
		System.out.println(miniCar);
		
		//필드값 변경
		//myCar.speed = 60;
		//System.out.println("수정된 속도: " + myCar.speed);

	}

}
