package co.memo.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.memo.model.Memo;

// MemoAccess를 구현하는 클래스입니다.
// 기능을 작성하세요.
public class MemoDAO implements MemoAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	Connection conn;
	
	@Override
	public void insert(Memo memo) {
		sql = "insert into friend values(?, ?, ?)";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, memo.getDate());
			psmt.setString(2, memo.getTitle());
			psmt.setString(3, memo.getContent());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	@Override
	public void update(Memo memo) {
		sql = "update memo set content = ? where title = ? ";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, memo.getContent());
			psmt.setString(2, memo.getTitle());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	@Override
	public void delete(String title) {
		sql = "delete from memo where title = ?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	@Override
	public ArrayList<Memo> selectAll() {
		connect();
		ArrayList<Memo> mList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from memo");
			rs = psmt.executeQuery();
			while (rs.next()){
				Memo memo = new Memo();
				memo.setDate(rs.getString("date"));
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
				mList.add(memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mList;
		
	}

	@Override
	public Memo FindByDate(String date) {
		connect();
		Memo mm = new Memo();
		sql = "select * from where date = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, date);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				mm.setDate(rs.getString("date"));
				mm.setTitle(rs.getString("title"));
				mm.setContent(rs.getString("content"));
			} else {
				System.out.println("조회할 날짜가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mm;
		
	}

	@Override
	public Memo FindByContent(String content) {
		connect();
		Memo mm = new Memo();
		sql = "select * from where content = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, content);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				mm.setDate(rs.getString("date"));
				mm.setTitle(rs.getString("title"));
				mm.setContent(rs.getString("content"));
			} else {
				System.out.println("조회할 내용이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mm;
		
		
	}
	

	public void connect() {

		String url = "jdbc:sqlite:C:/sqllite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void close() {
		if (rs != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
