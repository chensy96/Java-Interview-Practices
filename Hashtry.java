package review;

import java.util.HashMap;
import java.util.Scanner;

public class Hashtry {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	     HashMap<String, Integer> map = new HashMap<String, Integer>();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        Integer count;
	        boolean replica = true; 
	        
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	            count = map.get(magazine[magazine_i]);
	            if (count == null){
	                map.put(magazine[magazine_i], 1);
	            } else{
	                map.put(magazine[magazine_i], count+1);
	            }     
	        }
	        
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	            if(!map.containsKey(ransom[ransom_i]) || map.get(ransom[ransom_i]) < 1){
	             //   System.out.println("key: " + ransom[ransom_i] + "  Val: " + map.get(ransom[ransom_i]));
	            	replica = false;
	            } else{
	                //contains this key
	                Integer currentVal = map.get(ransom[ransom_i]);
	                map.replace(ransom[ransom_i], currentVal-1);
	            }
	        }
	        System.out.print("No");
	    }
}
