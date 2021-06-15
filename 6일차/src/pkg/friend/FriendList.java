package pkg.friend;

import java.util.ArrayList;

public class FriendList implements FriendAccess {
	ArrayList<Friend> friends;
	
	//public FriendList() {
	//	friends = new ArrayList<Friend>();
	//}

	@Override
	public void insert(Friend friend) {
		friends.add(friend);
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Friend selectOne(String name) {
		for(Friend f : friends) {
			if(f.getName().equals(name)) {    //contains
				return f;
			}
		}
		return null;
	}

	//@Override
	//public List selectAll() {
	//	System.out.println("friend List");
	//	return null;
	//}
	
	
	
	
}
