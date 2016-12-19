package com.learn.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class AysncTest {

	@Test
	public void test() {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		list.stream().map(data -> CompletableFuture.supplyAsync(() -> getNumber(data)))
				.map(compFuture -> compFuture.thenApply(n -> n * n)).map(t -> t.join())
				.forEach(s -> System.out.println(s));

	}

	private int getNumber(int a) {
		return a * a;
	}
	
	
	@Test
	public void testRun() {
		
		 int a = 5;
		 CompletableFuture.runAsync(()->printNumber(a));
		 
		 CompletableFuture.supplyAsync(() -> getNumber(a)).thenAccept(b-> {System.out.println(b.intValue());});
	    
		 CompletableFuture.supplyAsync(() -> getNumber(a)).thenAccept(b-> {System.out.println(b.intValue());});
		            
	}
	
	@Test
	public void testChain() {
	 
	     ChainAlgorithms algo = new ChainAlgorithms();
	     int a = 2;
	  // Create Stream of tasks:
	     Stream<Supplier<Integer>> tasks = Stream.of(
	             () -> algo.secondAParallelStep(a),
	             () -> algo.secondBParallelStep(a));
	     
	     

	     CompletableFuture.supplyAsync(() -> algo.firstStep(a))
	                      .thenApply(tasks.s);
	    				                               
	}
	

	private void printNumber(int a) {
		System.out.println("i got "+a);
	}
	

}
