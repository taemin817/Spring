package com.acorn.day2.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DramaDAO {

	@Autowired
	DataSource ds;
								// String 안돼!
	public ArrayList<Drama> select() {
		
		ArrayList<Drama> dList = new ArrayList<Drama>();
		
		String sql = "select * from drama_tbl";
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				String code = rs.getString("code");
				String title = rs.getString("title");
				String actors = rs.getString("actors");
				//String result = "Code: " + code + ", Title: " + title + ", Actors: " + actors;
				
				Drama  drama = new Drama();
				drama.setCode(code);
				drama.setTitle(title);
				drama.setActors(actors);
				dList.add(drama);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dList;

	}
}
