

package com.pack.validstring;






import java.util.Scanner;
import java.util.Stack;

public class  StringValid{

public static boolean isValid(String s) {
Stack<Character> stack = new Stack<Character>();
 for (int i=0;i<s.length();i++) {
 char c=s.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
                 stack.push(c);
           }
           
           else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
               stack.pop();
           } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
               stack.pop();
           } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
               stack.pop();
           }
           
           else {
               return false;
           }
       }
       return stack.isEmpty();
 
       
   }


public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int no;
      System.out.println("enter a strings:");
      no=scan.nextInt();
      scan.skip(System.lineSeparator());
      String[] s= new String[no];
      for(int counter=0;counter<no;counter++)
      {
     System.out.println("enter the string1 "+(counter+1));
     s[counter]=scan.nextLine();
      }
     
      scan.close();
      System.out.println("strings are");
      for(int counter=0;counter<no;counter++)
      {
     System.out.println(s[counter]);
      }
     

      boolean check = true;
          if(check){
                System.out.println("It is a valid string");
            }
            else{
                System.out.println("It is not a valid string");
            }
  }


}