package com.pack.test.validstring;

import com.pack.validstring.*;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;


public class test {
	
	StringValid v = new StringValid();

	

	@Test
	public void valid_parenthesis_isvalid()
	{
		String input = "()";
		
		assertEquals(true,v.isValid(input));
	}
	
	@Test
	public void valid_parenthesis_isvalid()
	{
		String input = "({})";
		
		assertEquals(true,v.isValid(input));
	}
	@Test
	public void valid_parenthsis_isinvalid()
	{
		String input = "(][";
		
		assertEquals(false,v.isValid(input));
	}
}

