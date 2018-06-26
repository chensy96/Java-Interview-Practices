package review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stacks {
    
    public static boolean isBalanced(String expression) {
        //{[()]}
    	/* 3
{[()]}
{[(])}
{{[[(())]]}} */
        int len = expression.length();
        if(len % 2 != 0){
//        	System.out.println("failed at 1");
            return false;
        }
        
        Stack<Character> exp = new Stack<Character>();
      
        for(int i = 0; i < (len/2); i++) {
//        	System.out.println("i= " + i);
           if(expression.charAt(i) == '(' ||
              expression.charAt(i) == '[' ||
             expression.charAt(i) == '{'){
            exp.push(expression.charAt(i));
           }
            else{
//            	System.out.println("failed at 2");
                return false;
            }
        }
        
        for(int j = len/2; j < len; j++){
//        	System.out.println("j= " + j);
        	char p = exp.pop();
            if(     (expression.charAt(j) == ')' && p != '(') ||
            		(expression.charAt(j) == '}' && p != '{') ||
            		(expression.charAt(j) == ']' && p != '[') 		
            		)
            {
            	//System.out.println("failed at 3, while j = " + j + " exp = " + expression.charAt(j) + " poped = " + c);
                return false;
            }
        }
        
        return true;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
