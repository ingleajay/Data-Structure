package com.recursion;

public class ProductOfNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4};
		System.out.println("Product of no : " +productofArray(A,A.length));
	}
	
	public static int productofArray(int A[], int N) 
    {   
        if(N == 0) {
        	return 1;
        }
        else {
        	return A[N-1]*productofArray(A,N-1);
        }
    } 

	// a[3]*p(a,2)
	// a[2]*p(a,1)
	// a[1]*p(a,0)
	
}
