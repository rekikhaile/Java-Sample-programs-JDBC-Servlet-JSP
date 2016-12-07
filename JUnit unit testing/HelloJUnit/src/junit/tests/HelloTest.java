package junit.tests;

import static org.junit.Assert.*;
import javaClasses.HelloWorld;


import org.junit.Test;


public class HelloTest {
	@Test
	public void testHelloWorld() { 
		HelloWorld hello = new HelloWorld();
		
		assertEquals(hello.helloJUnit(),"Hello JUnit");	
	}


}



