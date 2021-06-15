package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.board.model.Board;

public class BoardDAO implements BoardAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	Connection conn;

	@Override
	public void insert(Board board) {
		sql = "insert into board (b_title, b_content, b_writer)\r\n"//
				+ "values (?, ?, ?)\r\n" + "";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getB_title());
			psmt.setString(2, board.getB_content());
			psmt.setString(3, board.getB_writer());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void update(Board board) {
		sql = "update board \r\n" + "set b_content = ?\r\n" + "where b_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getB_content());
			psmt.setInt(2, board.getB_id());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void delete(int id) {
		sql = "delete from board \r\n" + "where b_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 모두 조회는 while 구문
	@Override
	public ArrayList<Board> selectAll() {
		connect();
		ArrayList<Board> bList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from board");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setB_content(rs.getString("b_content"));
				board.setB_id(rs.getInt("b_id"));
				board.setB_title(rs.getString("b_title"));
				board.setB_writer(rs.getString("b_writer"));
				bList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}

	// 단건 조회는 if 구문
	@Override
	public Board selectOne(int id) {
		connect();
		Board bo = new Board();
		sql = "select * from board where b_id =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				bo.setB_content(rs.getString("b_content"));
				bo.setB_id(rs.getInt("b_id"));
				bo.setB_title(rs.getString("b_title"));
				bo.setB_writer(rs.getString("b_writer"));
			} else {
				System.out.println("조회할 id가 없습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bo;
	}

	@Override
	public void comment(Board board) {
		sql = "insert into board (b_title, b_content, b_writer)\r\n"//
				+ "values (?, ?, ?)\r\n" + "";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getB_title());
			psmt.setString(2, board.getB_content());
			psmt.setString(3, board.getB_writer());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}


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
