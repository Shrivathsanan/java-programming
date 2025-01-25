import java.util.*;

class Random{
    static int random_number;
    static int choosen_number;
    static int count = 1;
    static int n=100;
    
    public void random(){
        random_number=(int) (Math.random() * (100))+1;
        System.out.println("\n The random number is Generated "+ random_number);
    }
    
    public static void main(String arg[]){
        Scanner c = new Scanner(System.in);
        Random obj = new Random();
        obj.random();
        for(int i=0;i<n;i++){
            System.out.println("\n  Enter your guess from the range 1 to 100 ");
           choosen_number = c.nextInt(); 
           
           if(random_number==choosen_number){
               System.out.println("\n  You Won, Your guess is correct congratulations!");
               break;
           }
           if(choosen_number>random_number){
               System.out.println("\n Your Guess is too High");
           }
           if(choosen_number<random_number){
                System.out.println("\n Your Guess is too Low");
           }
           else if(choosen_number>100){
                System.out.println("\n Invalid number, Enter a valid number within the range");
           }
           count++;
        }
        
        System.out.println("\n You found the number in "+ count +" tries" );
    }
}