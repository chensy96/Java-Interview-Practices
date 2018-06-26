package review;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams {
    public static int numberNeeded(String first, String second) {
      //make 1st and 2nd be of the same set of letters 35
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>(26);
        // HashMap<Character, Integer> map2 = new HashMap<Character, Integer>(26);
    
        //hashmaping for string 1st
        for(char c: first.toCharArray()){
            if(map1.get(c) == null){
            map1.put(c, 1);
            } else {
                map1.replace(c, map1.get(c)+1);
            }
        }
        
        int todelete = 0;
        
        for(char s: second.toCharArray()){
            if(map1.get(s) == null){
                map1.put(s, 1);
            } else{
                map1.replace(s, map1.get(s)-1);
            }
        }
 
        System.out.println(map1.values());
        
        Collection<Integer> offsets = map1.values();
        
        for(Integer offset : offsets){
        	if (offset != 0 && offset !=null){
        		System.out.println(offset);
        		todelete++;
        	}
        }
        
        return todelete;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
