package pkg.friend;

public class SchoolFriend extends Friend {
	
	String birth;
	
	public SchoolFriend() {}

	public SchoolFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	public SchoolFriend(String gubun, String name, String tel, String birth) {
		super(gubun, name, tel);
		this.birth = birth;
	}
	
	
	public void print() {
		
		System.out.printf("친구 : %20s %20s %20s %20s\n", gubun, name, tel, birth);
	}

}
