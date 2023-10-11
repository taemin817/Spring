package com.acorn.baemin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuDAO {

	@Autowired
	DataSource ds;

	// 등록
	public void create(Menu menu) {
		String sql = "insert into menu_tbl values(?, ?, ?, ?)";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, menu.getMenuNum());
			pst.setString(2, menu.getMenuName());
			pst.setInt(3, menu.getMenuPrice());
			pst.setString(4, menu.getMenuIntro());
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 단건조회
	public Menu readone(int menuNum) {
		String sql = "select * from menu_tbl where menuNum=?";
		Menu menu = null;
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, menuNum);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				menuNum = rs.getInt(1);
				String menuName = rs.getString(2);
				int menuPrice = rs.getInt(3);
				String menuIntro = rs.getString(4);
				menu = new Menu(menuNum, menuName, menuPrice, menuIntro);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return menu;
	}

	// 조회
	public ArrayList<Menu> read() {
		ArrayList<Menu> mlist = new ArrayList<>();

		String sql = "select * from menu_tbl";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int menuNum = rs.getInt(1);
				String menuName = rs.getString(2);
				int menuPrice = rs.getInt(3);
				String menuIntro = rs.getString(4);

				Menu menu = new Menu(menuNum, menuName, menuPrice, menuIntro);
				mlist.add(menu);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mlist;
	}

	// 수정
	public void update(Menu menu) {
		String sql = "update menu_tbl set menuName=?, menuPrice=?, menuIntro=? where menuNum=?";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, menu.getMenuName());
			pst.setInt(2, menu.getMenuPrice());
			pst.setString(3, menu.getMenuIntro());
			pst.setInt(4, menu.getMenuNum());
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 삭제
	public void delete(int menuNum) {
		String sql = "delete from menu_tbl where menuNum=?";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, menuNum);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
