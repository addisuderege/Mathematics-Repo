package com.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mum.service.ICalculatorService;

@RestController
public class MathController {
	//@Autowired
	private ICalculatorService calculator;
	
	@GetMapping("/sum")
	public Integer getSum(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
		return calculator.add(num1, num2);
	}
	
	@GetMapping("/substract")
	public Integer getDifference(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
		return calculator.substract(num1, num2);
	}
	
	@GetMapping("/product")
	public Integer getProduct(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
		return calculator.multiply(num1, num2);
	}

}
