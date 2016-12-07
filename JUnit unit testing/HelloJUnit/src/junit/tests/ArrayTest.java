package junit.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javaClasses.ArrayStat;


public class ArrayTest {
	@Test
	public void testArrayStat() { 
		ArrayStat arrayStat = new ArrayStat();
		int[] array1 = {1,4,2,7};
		int[] array2 = {100,4000,-200,700};
		assertEquals(arrayStat.findMaxValue(array1),7);	
		assertEquals(arrayStat.findMaxValue(array2),4000);	
	}

}
