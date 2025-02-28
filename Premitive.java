/*** finding premitive data type of a number by using try & catch*/


import java.util.*;

class Premitive{
	
	static long number;
	
	public static void main(String args[]) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the value: ");
		number = c.nextInt();
		
		try {
			if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
				System.out.println("Byte");
			}
			if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
				System.out.println("Short");
			}
			if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
				System.out.println("Int");
			}
			if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
				System.out.println("Long");
			}
			
		}
		catch(Exception e){
			System.out.println(number+ " can't be fitted anywhere.");
			
		}
	}
}