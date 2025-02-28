import java.util.*;

class PalindromeString{
    static String str;
    static String result="";
    public static void main(String arg[]){
        System.out.println("Enter the String to find whether it's palindrome: ");
        Scanner c = new Scanner(System.in);
        str=c.next();
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            
            result = result + str.charAt(i); 
        }
        System.out.println(result);
       
        if(str.equals(result)){
            System.out.println("The Entered String is a palindrome: "+ result);
        }
        else{
            System.out.println("The Entered String is not a palindrome: "+ result);
        } 
    }
}
