package com.acorn.baemin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

	@Autowired
	MenuService ms;

	// 조회
	@RequestMapping("/menuRead")
	public String read(Model model) {
		ArrayList<Menu> list = new ArrayList<>();
		list = ms.read();
		model.addAttribute("list", list);
		return "list";
	}

	// 등록화면으로
	@RequestMapping(value = "/menuCreate", method = RequestMethod.GET)
	public String create() {
		// ms.create(menu);
		return "create";
	}

	// 정보 입력하고 등록하면 조회페이지로
	@ResponseBody
	@RequestMapping(value = "/menuCreate", method = RequestMethod.POST)
	public void create(@RequestBody Menu menu) {
		ms.create(menu);
	}

	// 수정페이지에 기존정보 넣기
	@RequestMapping(value = "/menuUpdate", method = RequestMethod.GET)
	public String updateOne(Model model, int menuNum) {
		
		System.out.println(menuNum);
		Menu menu = null;
		menu= ms.readone(menuNum);
		model.addAttribute("one", menu);
		return "update";
	}

	// 정보 입력하고 수정하면 조회페이지로
	@ResponseBody
	@RequestMapping(value = "/menuUpdate", method = RequestMethod.POST)
	public void update(@RequestBody Menu menu) {
		ms.update(menu);
	}

	// 삭제
	@ResponseBody
	@RequestMapping(value = "/menuDelete", method = RequestMethod.GET)
	public void delete(int menuNum) {
		
		System.out.println(menuNum);
		ms.delete(menuNum);
	}
}
