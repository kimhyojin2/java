package pkg.friend;

public class FriendAppMain {

	public static void main(String[] args) {
		
		FriendList list = new FriendList();
		//등록
		Friend f = new CompanyFriend("현대해상", "김효진", "222");
		list.insert(f);
		f = new SchoolFriend("초등학교", "김수진", "111");
		list.insert(f);
		
		//검색
		System.out.println(list.selectOne("김효진"));
		
		//수정
		f = new SchoolFriend("초등학교", "김수진", "333");
		list.update(f);
		
		//삭제
		list.delete("김효진");
		
		//전체조회
		list.selectAll();
		

	}

}
