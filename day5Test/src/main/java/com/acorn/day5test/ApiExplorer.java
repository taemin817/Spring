package com.acorn.day5test;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;

@Component
public class ApiExplorer {
    public String api() throws IOException {
    	StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=d9LHQ39Jo2yMHM94lSeHU6hcA1leSEC2UW79oWDRyPpWUtKbzl1azmILwu5QUm0ynt%2BAyH%2FS3SuBgK4N7JWuFg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode("2023-10-10", "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 한달동안 예보통보 발령 날짜의 리스트 정보를 확인)*/
        urlBuilder.append("&" + URLEncoder.encode("InformCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*통보코드검색(PM10, PM25, O3)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        String result = sb.toString();
        return result;
    }
    
    public ArrayList<ItemDTO> fromJSONtoItems(String result){
   	 
   	 
   	 // String( json 구조를 가진 ) => JSON 객체로 변환
   	 // json관련 라이브러리
   	 /*pom.xml추가
   	<dependency>
       	<groupId>org.json</groupId>
       	<artifactId>json</artifactId>
       	<version>20230227</version>
   	</dependency>
   	  */
   	 
   	 
   	 JSONObject rjson = new JSONObject(result);
   	 System.out.println(rjson);
   	 
   	 JSONArray items = rjson.getJSONArray("items");
   	 
   	 ArrayList<ItemDTO> list = new ArrayList<>();
   	 
   	 for(int i=0; i<items.length(); i++) {
   		 JSONObject item = items.getJSONObject(i);
   		 System.out.println(item);
   		 String informCause = item.getString("informCause");
   		 String informData = item.getString("informData");
   		 String informGrade = item.getString("informGrade");
   		
   		 ItemDTO itemdto = new ItemDTO();
   		 itemdto.setInformCause(informCause);
   		 itemdto.setInformData(informData);
   		 itemdto.setInformGrade(informGrade);
   		 
   		 list.add(itemdto);
   		 
   	 }
   	 
   	 System.out.println("ArrayList==>" +list);
   	 return list;
   	 
    }
}
