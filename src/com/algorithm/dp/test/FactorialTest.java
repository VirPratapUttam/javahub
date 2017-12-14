package com.algorithm.dp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithm.dp.FactorialRecursive;

public class FactorialTest {


	@Test
	public void test() {
		assertEquals(120,FactorialRecursive.fact(5));
		assertEquals(6,FactorialRecursive.fact(3));
		assertEquals(1,FactorialRecursive.fact(0));
	}

}
