package com.useful;

public class Resize {
	private double length;
	private double height;
	
	public Resize() {
		length = 1080;
		height = 720;
	}
	
	public Resize(double l, double h) {
		length = l;
		height = h;
	}
	
	public double resize(String knownValue, double newSize) {//calcular fator
		double baseValue = 0;
		double valueToResize = 0;
		double resizingFactor = 0;
		//
		if (knownValue.equals("h")) {
			baseValue = this.height;
			valueToResize = this.length;			System.out.println(valueToResize);
		} else if (knownValue.equals("l")) {
			baseValue = this.length;
			valueToResize = this.height;
			
		} else {
			throw new IllegalArgumentException("\n **** invalid option selected ****");
		}
		//
		resizingFactor = newSize / baseValue;
		System.out.println(resizingFactor);
		
		return valueToResize * resizingFactor;
	}
	
	/*private double calcResizingFactor(double baseValue, double newSize) {
		return newSize / baseValue;
	}*/
}
