package co.friend.access;
//FriendAccess.java, FriendList.java

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;

	// name, tel 값을 담아주는 컬렉션.
	public Map<String, String> getNameTel(){
		Map<String, String> map = new HashMap<>();
		String sql = "select name, tel from friend";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getString("name"), rs.getString("tel"));}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return map;
	}
	
	@Override
	public void insert(Friend Friend) {
		String sql = "insert into friend values(?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Friend.getGubun());
			psmt.setString(2, Friend.getName());
			psmt.setString(3, Friend.getTel());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Friend Friend) {
		// 구분, 이름, 전화
		// 동일한 이름은 없다는 전제.
		// where name=?
		String sql = "update friend set tel=? where name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Friend.getTel());
			psmt.setString(2, Friend.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		String sql = "delete from friend where name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend); // 데이터 건수만큼 ArrayList 담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	@Override
	public Friend selectOne(String name) {
		Friend fr = new Friend();
		String sql = "select * from friend where name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();

			if (rs.next()) {
				fr.setGubun(rs.getString("gubun"));
				fr.setName(rs.getString("name"));
				fr.setTel(rs.getString("tel"));
			} else {
				System.out.println("조회할 이름이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return fr;
	}

	@Override
	public Friend findTel(String tel) {
		Friend fr = new Friend();
		String sql = "select * from friend where tel=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			rs = psmt.executeQuery();

			if (rs.next()) {
				fr.setGubun(rs.getString("gubun"));
				fr.setName(rs.getString("name"));
				fr.setTel(rs.getString("tel"));
			} else {
				System.out.println("조회할 전화번호가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return fr;
	}

}
