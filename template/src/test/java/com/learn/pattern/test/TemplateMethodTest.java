package com.learn.pattern.test;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.learn.pattern.Algorithm;
import com.learn.pattern.AlgorithmSpecificA;
import com.learn.pattern.AlgorithmSpecificB;


public class TemplateMethodTest {

	@Test
	public void testrunAlgorithm() {
		Algorithm algo1 = new AlgorithmSpecificB();
		Algorithm algo2 = new AlgorithmSpecificA();
		algo1.runAlgorithm();
		algo2.runAlgorithm();
		assertNotNull(algo1);
		assertNotNull(algo2);
	}

}
