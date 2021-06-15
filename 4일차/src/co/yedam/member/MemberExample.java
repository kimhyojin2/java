package co.yedam.member;

public class MemberExample {
	
	Member[] members = new Member[10];
	int cnt = 0;
	
	//회원가입
	void insert(String id, String password, String name, int age) {
		members[cnt] = new Member(id, password, name, age);
		cnt++;
	}
	
	//회원리스트
	void printList() {
		for
	}
	
	void print Member(int i) {
		System.out.println(members[i].name);
		System.out.println(members[i].id);
		System.out.println(members[i].age);
	}
	
	boolean login(String id, String password) {
		for(int i=0; i<cnt; i++) {
			if(id.equals(members[i].id) &&
				password.equals(members[i].password)) {
				return true;
			}
		}
		return false;
	}
			
}
