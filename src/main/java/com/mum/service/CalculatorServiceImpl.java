package com.mum.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

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
	System.out.println("mathematical calculations...");

	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

}
