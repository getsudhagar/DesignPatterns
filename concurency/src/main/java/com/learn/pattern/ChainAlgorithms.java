package com.learn.pattern;

public class ChainAlgorithms {
 
 public int firstStep(int a){
	 System.out.println(a+1);
	 return a+1;
 }
 public int secondAParallelStep(int a){
	 System.out.println(a*a);
	 return a*a;
 }
 
 public int secondBParallelStep(int b){
	 System.out.println(b*b);
	 return b*b;
 }

 
 public int finalStep(int a ,int b){
	 System.out.println(a-1);
	 return a+b;
 }


}
