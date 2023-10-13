package com.acorn.day5test;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

	String informGrade;
	String informCause;
	String informOverall;
	String informData;
	String imageUrl1;
	String imageUrl2;
	String imageUrl3;
	String imageUrl4;
	String imageUrl5;
	String imageUrl6;
 
}
