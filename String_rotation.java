package review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_rotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        a = rotate(a, k, n);
        
        for(int i=0; i< n; i++){
        	System.out.print(a[i]);
        	 System.out.print(" ");
        }
        
    }
    
    public static int[] rotate2(int[] a, int d, int n){
    	int[] r = new int[n];
    	//12345
    	//51234
   //  which one should be on a[i]
		
    	for (int i=0; i < n; i++){
    		
    		if(i+d < n){
    		r[i] = a[i+d];
    		} else{
    			r[i] = a[i-n+d];
    			//1->0  d=4 length=5 i-length+d 1-5+4=0 
    		}
    	}
    	return r;
    }
    
    public static int[] rotate(int[] a, int d, int n){
    	//12345
    	//11345 2
    	//11245 3
    	//11235 4
    	//11234 5
    	//51234
    	// a[i] should be on where
		int temp;
		int temp2;
		int c = 0; //curent
		
		temp = a[0];
		
		
		if(d==n/2){
			
			for(int i=0; i < n/2; i++){
				
				temp = a[i];
				a[i] = a[i+d];
				a[i+d] = temp;
			}
		} else {
			for(int i=0; i < n; i++){		
		if(c-d >=0){
			temp2 = a[c-d];
			a[c-d] = temp;
			c = c-d;
			temp = temp2;
		} else{
			temp2 = a[c-d+n];
		a[c-d+n] = temp;
		c=c-d+n;
		temp = temp2;
		}
		
		}	
		}
    	return a;
    }
    
    // wrong case1
    //14 7
    //        98 67 35 1 74 79 7 26 54 63 24 17 32 81
    //		  98 67 35 1 74 79 7 98 54 63 24 17 32 81   temp=26 temp2=26 c=7  26 was on a[7] ->find where 26 should be at -> a[0] <-this step succeed
    //out:    26 67 35 1 74 79 7 98 54 63 24 17 32 81   temp=   temp2=98
    //expect: 26 54 63 24 17 32 81 98 67 35 1 74 79 7
}