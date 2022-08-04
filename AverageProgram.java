/*
 * Author : Anjali
 * Program : This shows how to calculate average value of array.
 */

package StringProgram;

public class AverageProgram {

	public static void main(String[] args) {               // main method 
				
			int[] num = new int[]{7, 36, 76, 25, 43, 10};   //Sum of elements 
			
			       int sum = 0;
			       for(int i=0; i < num.length ; i++)
			    	   
			        sum = sum + num[i];               //find the average value
			       
			        int average = sum / num.length;
			        
			        System.out.println("Average value is : " + average); 
			   }
			}

	}

}
