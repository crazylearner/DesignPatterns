package com.demo.memento.caretaker;

import java.util.ArrayList;
import java.util.List;

import com.demo.memento.observer.Calculator;

public class CalculatorUser {

	public static void main(String[] args) {
		List<Calculator.Memento> states = new ArrayList<>();
		
		Calculator calc = new Calculator(10, 12);
		System.out.println(calc.add());
		states.add(calc.getMemento());
		
		calc.setA(12);
		calc.setB(33);
		System.out.println(calc.add());
		states.add(calc.getMemento());
		
		calc.restoreFromMemento(states.get(0));
		System.out.println(calc.add());
	}
}
