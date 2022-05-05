package week3day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,7,6,8,10,11};
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++)
       {
    	   if(i+1!=arr[i])
    	   {
    		   System.out.println(i+1);
    		   break;
    	   }
    	   
       }

	}

}
