package review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Heapmid {
    
	  public static double addNumber(int a, PriorityQueue<Integer> l, PriorityQueue<Integer> h){
//	        double mid;
	        PriorityQueue<Integer> small;
	        PriorityQueue<Integer> big;
	        
	        if(l.isEmpty() || a < l.peek()){
	            l.add(a);
	        } else{
	            h.add(a);
	        }
	        
	        if(l.size() == h.size()){
//	        	System.out.println("from two");
	            return ((double)l.peek()+h.peek())/2;}
	        else{
	            
	        if(l.size() < h.size()){
	        small = l;
	        big = h;
	        } else{
	           small = h;
	           big = l;
	        }
	        int diff = big.size() - small.size();
//	        System.out.println("big size = " +big.size() + "  small size = " + small.size());
	          
	            if(diff > 1){
	            	int i = big.poll();
//	            	System.out.println("adding " + i + " from big to small");
	                small.add(i);
	                return ((double)small.peek()+big.peek())/2;
	            } 
//	            System.out.println("from one");
	            return big.peek();
	        } 
	        
	        // return mid;
	    }
//     publilc static double findMid(PriorityQueue<Integer> s, PriorityQueue<Integer> b){
//         double median;
        
        
//         return median;
//     }

    public static void main(String[] args) {
         PriorityQueue<Integer> lower = new PriorityQueue<Integer>( new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return -1 * a.compareTo(b);
            }
        });
         PriorityQueue<Integer> higher = new PriorityQueue<Integer> ();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[26];
     
        
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            System.out.println(addNumber(a[i], lower, higher));
            
          //  balanceQ(lower, higher); goes into add Number
        }
        //so at this point we have the array of doubles
        //it is reasonable to divide the array into lower part and higher part using prioirty queue as heap
        //how about updatingit while adding the int into the array?
    }
}
