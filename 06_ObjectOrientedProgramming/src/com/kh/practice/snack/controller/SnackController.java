package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	Snack s = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor,
			int numOf, int price) {
		
		
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		
		
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		
		String kind = s.getKind();
		String name = s.getName();
		String flavor = s.getFlavor();
		int numOf = s.getNumOf();
		int price = s.getPrice();
		
		String result = (kind + "(" + name + "-" + flavor + ")" +
				numOf + "개" + price + "원");
		

		return result;
	}

}
