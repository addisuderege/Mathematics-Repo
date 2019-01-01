package com.mum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mum.service.CalculatorServiceImpl;
import com.mum.service.ICalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MathsAppApplicationTests {

	private ICalculatorService calculatorService;
	
	//@Autowired
	//private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		calculatorService=new CalculatorServiceImpl();
		//mockMvc=MockMvcBuilder.
	}
	
	@Test
	public void testAdd() {
		int expected=10;
		int actual=calculatorService.add(4, 6);
		assertEquals(expected, actual);
		
		
	}
	
	
// tests2	
	@Test
	public void testSubstract() {
		int expected=4;
		int actual=calculatorService.substract(10, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {		
		assertEquals(24,calculatorService.multiply(4, 6));
	}
	
	


}

