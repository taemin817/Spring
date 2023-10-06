package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TestService {

	public ArrayList<String> getDan(int dan) {
		ArrayList<String> danList = new ArrayList<String>();
		
		for(int i = 1; i<=9; i++) {
			danList.add(dan + "*" + i + "=" + dan*i);
		}
		
		return danList;
	}
	
	public ArrayList<String> getMovieList() {
		ArrayList<String> movieList = new ArrayList<>();
		movieList.add("너의 이름은");
		movieList.add("날씨의 아이");
		movieList.add("스즈메의 문단속");
		
		return movieList;
	}
	
	public ArrayList<ResInfo> getResInfo(){
		ArrayList<ResInfo> resInfo = new ArrayList<ResInfo>();
		resInfo.add(new ResInfo("싸다김밥", 7, 22));
		resInfo.add(new ResInfo("메가커피", 7, 23));
		resInfo.add(new ResInfo("요거프레소", 8, 21));
		
		return resInfo;
	}
	
}
