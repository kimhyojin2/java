package co.yedam.member;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.insert("hong", "12345", "홍길동", 0);
		memberService.insert("kim", "1111", "김유신", 0);
		memberService.insert("choi", "2222", "최기자", 0);
		//
		memberService.printList();
		
		memberService.printMember(1);
		
		System.out.println(memberService.login("kim", "1111"));
		System.out.println(memberService.login("kim", "1234"));
	}
}
