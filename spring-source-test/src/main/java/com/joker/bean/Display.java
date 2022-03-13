package com.joker.bean;

public abstract class Display {

	public abstract Car getCar();

	public void display() {
		getCar().display();
	}
}
