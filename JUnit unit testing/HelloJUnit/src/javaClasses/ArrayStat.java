package javaClasses;

public class ArrayStat {
	
	public int findMaxValue(int[] arr)
	{
		int maxValue = 0;
		for(int i=1; i<arr.length; i++)
		{
			if(maxValue < arr[i])
				maxValue = arr[i];
			
		}
		return maxValue;
	}


}
