package com.acorn.day1.di;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TestService2 {
	public ArrayList<String> getList() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("아이스아메");
		list.add("아이스라떼");
		list.add("아이스모카");
		list.add("아이스밀크티");
		return list;
	}
}
