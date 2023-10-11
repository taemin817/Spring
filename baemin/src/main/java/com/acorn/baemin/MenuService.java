package com.acorn.baemin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MenuService {

	@Autowired
	MenuDAO dao;
	
	//등록
	public void create(Menu menu) {
		dao.create(menu);
	}
	
	//단건조회
	public Menu readone(int menuNum) {
		return dao.readone(menuNum);
	}
	
	//조회
	public ArrayList<Menu> read() {
		return dao.read();
	}
	
	//수정
	public void update(Menu menu) {
		dao.update(menu);
	}
	
	//삭제
	public void delete(int menuNum) {
		dao.delete(menuNum);
	}
}
