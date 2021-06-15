package co.micol;

public class Superman extends Fly implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("Superman takes off");
	}

	@Override
	public void fly() {
		System.out.println("Superman is flying");
	}

	@Override
	public void land() {
		System.out.println("Superman is landing on the ground");
	}

	
}
