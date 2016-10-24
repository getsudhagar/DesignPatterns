package com.learn.pattern;

/**
 * Decorator maintains the interface while adding features.
 *
 */
public class ConcreteComponent implements Component {

	public void draw() {
		System.out.println("ConcreteComponent");
		
	}

}
