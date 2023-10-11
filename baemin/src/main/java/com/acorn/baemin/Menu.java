package com.acorn.baemin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

	int menuNum;
	String menuName;
	int menuPrice;
	String menuIntro;
	
}
