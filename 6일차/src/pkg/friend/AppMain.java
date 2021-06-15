package pkg.friend;

public class AppMain {

	public static void main(String[] args) {
		Friend f = new CompanyFriend("학교", "홍길동", "1111", "과장");
		f.print();
		
		Friend f1 = new SchoolFriend("학교", "홍길동", "1111", "0101");
		// f1.print();
		// 다형성 (상속받고 오버라이딩 전제조건)
		// 1. 부모타입의 참조변수가 자식객체를 참조가능
		// 2. 메소드 실행하면 참조대상의 메소드가 호출되므로 결과가 다르다.
		
		// FriendAccess manager = BeanFactory.getBean(FriendAccess.class);
		// new FriendManager(); //new FriendList(); 
		FriendManager manager = new FriendManager();
		for(Friend fr : manager.friends) {
			if(fr instanceof CompanyFriend) {
				fr.print();
			}
		}

	}

}
