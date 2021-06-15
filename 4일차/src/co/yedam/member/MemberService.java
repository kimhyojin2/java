package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	Member[] members = new Member[3];
	int cnt = 0;
	
	//sign in
	//Scanner sc = new Scanner();
	void insert(String name, String id, String pw, int age) {
		members[cnt+1] = new Member(name,id,pw,age)
	}
	
	Scanner sc = new Scanner(System.in);
	
	void insert() {
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		int age = sc.nextInt();
		members[cnt] = new Member(id,password,name,age);
		cnt ++;
	}
	
	//회원리스트
	void printList() {
		for(int i=0 ; i<cnt; i++) {
			System.out.println(members[i]);
		}
	}
	
	void printMember(int i) {
		System.out.println(members[i].name);
		System.out.println(members[i].id);
		System.out.println(members[i].age);
	
	}
	
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	boolean login(String id, String pw) {
		if (id.equals("hong") && pw.equals("12345")) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		else {
			System.out.println("틀린 비밀번호입니다.");
			return false;
			
		}
		
	}

}
