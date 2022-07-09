package com.recursion;

public class PowerOfNo {

	public static void main(String[] args) {
	      int p, n, result;
	      n = 2;
	      p = -1;
	      result = getPower(n, p);
	      System.out.println("The result of " +n + "^" + p + " is " + result);
	   }
	   public static int getPower(int n, int p) {
		   
		  if(p<0) {
			  return -1;
		  }
		   
	      if (p != 0) {
	         return (n * getPower(n, p - 1));
	      }
	      else {
	         return 1;
	      }
	   }

	// 2<=4 , mul = 2*p(2,3)
	// 2<=3, mul = 2*2*p(2,2)
	// 2<=2 , mul = 2*2*2*p(2,1)
	// 2<=1  = false
}
