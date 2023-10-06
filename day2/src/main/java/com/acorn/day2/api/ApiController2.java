package com.acorn.day2.api;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.day2.db.Drama;

@Controller
public class ApiController2 {

	// 조회
	@ResponseBody
	@RequestMapping(value = "/drama", method=RequestMethod.GET)
	public ArrayList<Drama> getList(){
		ArrayList<Drama> list = new ArrayList<Drama>();
		Drama drama = new Drama();
		drama.setCode("d0001");
		drama.setTitle("무빙");
		drama.setActors("류승룡");
		
		list.add(drama);
		
		Drama drama2 = new Drama();
		drama2.setCode("d0002");
		drama2.setTitle("더글로리");
		drama2.setActors("송혜교");
		
		list.add(drama2);
		
		return list;
	};
	// 등록
	@ResponseBody
	@RequestMapping( value="/drama" , method=RequestMethod.POST)
	public void  register(@RequestBody Drama drama) {
		System.out.println( drama);
	}
	// 변경
	@ResponseBody
	@RequestMapping( value="/drama" , method=RequestMethod.PUT)
	public void  update(@RequestBody Drama drama) {
		System.out.println( drama);
	}
	// 삭제
	@ResponseBody
	@RequestMapping( value="/drama/{code}" , method=RequestMethod.DELETE)
	public void  delete(@PathVariable String code) {
		System.out.println( code);
	}
}
