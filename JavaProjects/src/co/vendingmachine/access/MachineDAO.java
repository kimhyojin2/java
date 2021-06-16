package co.vendingmachine.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.vendingmachine.model.Machine;

public class MachineDAO implements MachineAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	Connection conn;

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

//	@Override
//	public void insert_Coin(Machine machine) {
//		sql = "insert into vendingmachine (?, ?, ?)";
//		connect();
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, machine.getDrink_name());
//			psmt.setInt(2, machine.getDrink_price());
//			psmt.setInt(3, machine.getDrink_stock());
//			int r = psmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//
//	}

	@Override
	public void return_Coin() {

	}

	@Override
	public void enter_Menu(Machine machine) {
		connect();
		sql = "insert into vendingmachine (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, machine.getDrink_name());
			psmt.setInt(2, machine.getDrink_price());
			psmt.setInt(3, machine.getDrink_stock());
			int r = psmt.executeUpdate();
			System.out.println(r + "건의 메뉴가 등록 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void delete_Menu(String drink_name) {
		connect();
		sql = "delete from vendingmachine where drink_name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, drink_name);
			int r = psmt.executeUpdate();
			System.out.println(r + "건의 메뉴가 삭제 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void update_Menu(Machine machine) {
		sql = "update vendingmachine set drink_name=?,drink_price=?,drink_stock=? where drink_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, machine.getDrink_name());
			psmt.setInt(2, machine.getDrink_price());
			psmt.setInt(3, machine.getDrink_stock());
			int r = psmt.executeUpdate();
			System.out.println(r + "건의 메뉴가 수정 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void enter_Stock() {

	}

	@Override
	public ArrayList<Machine> print_Menu() {
		connect();
		ArrayList<Machine> mList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from vendingmachine");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Machine machine = new Machine();
				machine.setDrink_name(rs.getString("drink_name"));
				machine.setDrink_price(rs.getInt("drink_price"));
				machine.setDrink_stock(rs.getInt("drink_stock"));
				mList.add(machine);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mList;

	}

	@Override
	public Machine choice_Menu(String drink_name) {
		connect();
		Machine mc = new Machine();
		
			
		

	}
	return mc;

}
