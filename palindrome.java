import java.util.*;

class Palindrome{

static int number=121;
static int reference=number;
static int remainder;
static int result;

public void palindrome(){

while(number>0){

remainder = number%10;
//for last digit
result = (result*10) + remainder;
number = number/10; 
//for decreasing number
}
}
public static void main(String args[]){
Palindrome object = new Palindrome();
object.palindrome();
if(reference==result){
System.out.println("The number "+reference +" is a palindrome number");
}
else{
System.out.println(reference +" is not a palindrome number");
}
}
}