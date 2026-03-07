package com.automation;

public class Test_13 {

    public static void main(String[] args) {

    	int[] arr = {1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20,
                21,23,24,25,26,27,28,29,30}; 

   int exp= 30*31/2;
   int act=0;
   
   for(int e:arr) {
  	 act += e;
   }
   
   int num = exp-act;
   System.out.println(num);
			
    }
}
