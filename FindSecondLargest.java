package week3day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7,10};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
	}

}
