package com.demo.memento.observer;

public class Calculator {
	int a;
	int b; 

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add(){
		return a+b;
	}
	
	public Memento getMemento(){
		return new Memento(a, b);
	}
	
	public void restoreFromMemento(Memento memento){
	     Calculator calc = memento.getCalculator();
	     this.a = calc.a;
	     this.b = calc.b;
	}
	
	public static class Memento {
		Calculator calc;
		
		public Memento(int a, int b) {
			this.calc = new Calculator(a , b);
		}
		
		Calculator getCalculator(){
			return this.calc;
		}
	}

}
