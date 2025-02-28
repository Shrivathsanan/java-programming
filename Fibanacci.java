/*** Fibonacci series*/

import java.util.*;

class Fibanacci{

static int total;
static int number1=0;
static int number2=1;
static int next_number=0;

public static void main(String args[]){
	System.out.println("Enter the value for finding fibonacci series: ");
	Scanner C = new Scanner(System.in);
	total=C.nextInt();
			if((number1==0) && (number2==1)){
System.out.println(number1);
System.out.println(number2);
}
for(int i=3;i<=total;i++){

next_number=number1+number2;

System.out.println(next_number);

number1=number2;
number2=next_number;

}
}
}
