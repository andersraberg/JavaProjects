package snafu.projone.test;

import static org.junit.Assert.*;

import org.junit.Test;

import snafu.projone.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testAdd() {
	  assertEquals(7, HelloWorld.add(3, 4));
	}

}
