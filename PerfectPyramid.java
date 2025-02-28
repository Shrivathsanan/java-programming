/*** Pattern program */

import java.util.*;

class PerfectPyramid{
    static int number;
    
    public static void main(String args[]){
        
        System.out.println("Enter the number of colum to print the pattern: ");
        Scanner c = new Scanner(System.in);
        number=c.nextInt();
        
        for(int i = 0; i < number; i++){
            
             for (int j = number - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
                
                System.out.println();

            }
        }
        
    }