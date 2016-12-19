package com.learn.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamTest {

	@Test
	public void test() {
		
		List<String>strings = Arrays.asList("john doe", "", "dd szxd", "sds ds", "sd df");
		List<String>strings2 =strings.stream().map(string -> string.split(" ")[1]).collect(Collectors.toList());
		
	}

}
