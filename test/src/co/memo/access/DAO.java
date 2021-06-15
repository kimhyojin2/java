package co.memo.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public Connection conn;

	protected DAO() {
		String url = "jdbc:sqlite:C:/sqllite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
