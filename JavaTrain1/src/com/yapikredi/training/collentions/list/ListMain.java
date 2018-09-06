package com.yapikredi.training.collentions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		// Liste s�ral� ekle
		strList.add("osman1");
		strList.add("osman2");
		
		// Listeden index ile alma
		String string1 = strList.get(0);
		String string2 = strList.get(1);
		
		// Listeyi index ile g�ncelleme
		strList.add(0, "osman4");
		
		String string3 = strList.get(0);
		
		// Liste silme
		strList.clear();
		
		// Liste arama
		boolean contains = strList.contains("osman1");
		
		// Listeyi s�ral� d�nme
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		// Listeyi s�ral� d�nme
		for (String xyz : strList) {
			System.out.println(xyz);
		}
		
		// S�ralama
		Collections.sort(strList);
		
		
		
	}
	
}
