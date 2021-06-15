package 클래스;

public class Calculator {

	//싱글톤
	private Calculator instance = new Calculator();
	public static getInstance() {
		return instance;
	}
	private Calculator() {}
	public int add(int a, int b) {
		return a + b;
	}
}
