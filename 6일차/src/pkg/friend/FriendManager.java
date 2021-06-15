package pkg.friend;

import java.util.List;

public class FriendManager implements FriendAccess {
	
	Friend[] friends = new Friend[10];
	
	public FriendManager() {
		friends[0] = new CompanyFriend("예담회사", "순이", "010-2222-4444");
		friends[1] = new SchoolFriend("와룡초등", "진이", "010-3333-4444");
		friends[2] = new SchoolFriend("와룡중", "홍길동", "010-5555-4444");
		friends[3] = new CompanyFriend("현대", "김기자", "010-6666-4444");
		friends[4] = new CompanyFriend("예담회사", "김유신", "010-7777-4444");
	}
	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List selectAll() {
		System.out.println("Friend Manager");
		return null;
	}

	@Override
	public Friend selectOne(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	
	
	



