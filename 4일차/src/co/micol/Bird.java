package co.micol;

public class  Bird extends Animal {
	
	Bird(){}
	public void run() {
		System.out.println("걸어다닌다.");
	}
	public void eat() {
		System.out.println("주로 벌레를 먹는다");
	}
	public void takeOff() {
		System.out.println("takeoff");
	}
	public void fly() {
		System.out.println("날아다닌다");
	}
	public void land() {
		System.out.println("landdd");
	}
	public void layEggs() {
		System.out.println("알낳는다");
	}

}
