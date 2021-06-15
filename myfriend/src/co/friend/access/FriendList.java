package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;

public class FriendList implements FriendAccess {

	ArrayList<Friend> friends;

	public FriendList() {
		friends = new ArrayList<Friend>();
	}

	@Override
	public void insert(Friend Friend) {
		friends.add(Friend);

	}

	@Override
	public void update(Friend Friend) {
		for (Friend f : friends) {
			if (f.getName().equals(Friend.getName())) { // contains
				f.setTel(Friend.getTel());
			}
		}

	}

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) { // contains
				friends.remove(f);
				break;
			}
		}

	}

	@Override
	public ArrayList<Friend> selectAll() {

		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) { // contains
				return f;
			}
		}
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

}
