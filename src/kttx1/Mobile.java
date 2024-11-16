/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kttx1;

/**
 *
 * @author 84363
 */
public class Mobile extends Product{
    private String color;
	private double screensize;

	public Mobile() {
	}

	public Mobile(int id, String name, double price, int quantity, String color, double screensize) {
		super(id, name, price, quantity);
		this.color = color;
		this.screensize = screensize;
	}

	public String getColor() {
		return color;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	@Override
	public String toString() {
		return "Mobile" + super.toString() + ", CL=" + color + ", SS=" + screensize;
	}
}
