package com.yapikredi.training.zoo.v4;

public class Hayvan {
	
	private String name;
	
	public Hayvan(String name) {
		this.name = name;
	}
	
	public void yuru() {
		System.out.println("Y�r�yor");
	}

	public void yemek() {
		System.out.println("yemek yiyor");
	}

	public void uyu() {
		System.out.println("uyuyor");
	}

	public void konus() {
		System.out.println("konu�uyor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
