package com.learn.pattern;
/**
 *runAlgorithm is a Template method 
 *
 */
public abstract class Algorithm {

	public void startStep() {
      System.out.println("Start Step");
	}

	abstract public void specificStepA();

	abstract public void specificStepB();

	public void endStep() {
		 System.out.println("End Step");
	}

	public void runAlgorithm() {
		startStep();
		specificStepA();
		specificStepB();
		endStep();
	}

}
