package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void display() {
		System.out.println("hp laptop display");
	}
}
