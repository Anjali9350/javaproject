package Anjali.com;

/**
 * 
 * @author  : Anjali
 *
 */
import java.util.LinkedHashSet;

public class RemoveDuplicate {

			// Function to remove duplicate from array
		    public static void removeDuplicates(int[] a)
		    {
		        LinkedHashSet<Integer> set
		            = new LinkedHashSet<Integer>();
		 
		        // adding elements to LinkedHashSet
		        for (int i = 0; i < a.length; i++)
		            set.add(a[i]);
		 
		        // Print the elements of LinkedHashSet
		        System.out.print(set);
		    }
		 
		    // Driver code
		    public static void main(String[] args)
		    {
		        int a[] = {7,5,4,3,3,2,5,9,3,2,1,6,0};
		     
		        // Function call
		        removeDuplicates(a);
	}
}