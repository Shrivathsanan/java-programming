/*** Program for anagram with strings eg: top pot */

import java.util.*;

 class Anagram{

public static void main(String args[]){
    String str1;
    String str2;
    System.out.println("Enter string input: ");
    Scanner c = new Scanner(System.in);
    str1 = c.next();
    str2 = c.next();
    
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    
    char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    
    if(str1.length()==str2.length()){
             if (Arrays.equals(ch1, ch2)) {
            System.out.println("Entered strings are anagram");
        } 
             else {
            System.out.println("Entered strings are not anagram");
        }
        }
    else{
        System.out.println("Mismatch of entered string length");
    }
}
}