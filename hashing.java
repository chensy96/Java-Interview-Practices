package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashing {
	
	 
	 public static void main(String[] args) 
	    {
	     finduncom("characters", "alphabets");
	    }
	 
	 public static void finduncom (String str1, String str2){
		 
		 HashMap<Character, Integer> map = new HashMap<>(26);

		 for (int i =0; i < str1.length(); i++){
			 map.put(str1.charAt(i), 1); 
		 }
		 
		 System.out.println("Size of map is: " + map.size());
		 
		 print(map); //'K'
	     
	     for (int j =0; j < str2.length(); j++){
	    	 if (map.containsKey(str2.charAt(j))){
	    		 map.put(str2.charAt(j), 2);
//	    		 System.out.println("One common: " + str2.charAt(j));
	    	 }
	    	 else {
//	    		 System.out.println("One UNcommon: " + str2.charAt(j));
	    		 map.put(str2.charAt(j), 1);
	    	 }
	     }

	     
	     for(Entry<Character, Integer> entry:map.entrySet()){    
	         if(entry.getValue() == 1){
	        	 System.out.println(entry.getKey()); 
	         }        
	     }    
    print(map); 
	         
	        map.clear();
	        print(map);
	 }
	 
	   public static void print(Map<Character, Integer> map) 
	    {
	        if (map.isEmpty()) 
	        {
	            System.out.println("map is empty");
	        }
	         
	        else
	        {
	            System.out.println(map);
	        }
	    }
}
