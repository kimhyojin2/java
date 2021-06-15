package co.micol;

public class AppMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.sleep();
		human.think();
		
		Bird bird = new Bird();
		bird.run();
		bird.eat();
		bird.takeOff();
		bird.fly();
		bird.land();
		bird.layEggs();
		
		Flyer superman = new Superman();
		superman.fly();
		

	}

}
