package javapractice;

import java.util.ArrayList;
import java.util.HashSet;

public class TenTenInterview {

	
	public static int maxLength(int A[], int size) {
	    if (size <= 1) return size; // check for null also
	    int maxLength = 1;
	    int curLength = 1;
	    for (int i = 1; i < size; i++) {
	        //extra check to finish earlier if possible (you may omit it)
	        if ((size - i + curLength) <= maxLength)
	            return maxLength;
	        if (A[i] > A[i-1]) //use >= if equal elements count too
	            curLength++;
	        else {
	            if (maxLength < curLength)
	                maxLength = curLength;
	            curLength = 1;
	        }

	    }
	    //final check (in case the last element is included in maxLength)
	    if (maxLength < curLength)
	        return curLength;
	    return maxLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int A[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int size = A.length;
        System.out.println("Size of Array is "+ size);
        System.out.println("Length of Longest Increasing Subsequence is "+ maxLength(A, size));
        	

	}

}
