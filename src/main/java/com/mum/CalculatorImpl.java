package com.mum;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements ICalculator {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		return x-y;
	}

	@Override
	public void display() {
		System.out.println("... Mathematical Calculations ...");

	}

}
