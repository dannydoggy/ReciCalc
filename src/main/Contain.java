package main;

import food.Food;

public class Contain {
	private double number;
	private Food food;
	public Contain(double number, Food food) {
		this.number = number;
		this.food = food;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
}
