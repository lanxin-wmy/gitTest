package org.wmy;

public class Car {
	String color;
	int price;
	public Car(){
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + "]";
	}
	
}
