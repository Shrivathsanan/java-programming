/*** Sample Automatic Teller Machine Mechanism 
account_number for this program is "12345678"
pin for this program is "2442" */

import java.util.*;

class Atm{
    static int number;
    static int account_number;
    static int pin;
    static int balance = 25000;
    static int deposit;
    static int withdraw;
    static int confirmation;
    static int current_balance=0;
    
    public void deposit(){
        System.out.println("Enter the amount to Deposit: ");
    }
    public void withdraw(){
         System.out.println("Enter the amount to Withdraw: ");
    }
    public void check_balance(){
        System.out.println("Current balance: "+ balance);
    } 
    
    public static void main(String args[]){
        Atm obj = new Atm();
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Valid Account Number: ");
        account_number=c.nextInt();
        System.out.println("Enter the correct four digit pin number: ");
        pin=c.nextInt();
        if(account_number==12345678){
            if(pin==2442){
        System.out.println("1 : is for Depositing");
        System.out.println("2 : is for Withdraw amount");
        System.out.println("3 : is for Checking Balance");
        System.out.println("4 : for Exit");
        
        System.out.println("\n Please Choose the number based on its function as mentioned: ");
        
        number = c.nextInt();
        
        switch(number){
            case 1:
                obj.deposit();
                deposit=c.nextInt();
                System.out.println("Current balance with deposited "+deposit+" is "+ (deposit+balance));
                break;
            case 2:  
                obj.withdraw();
                withdraw=c.nextInt();
                if(withdraw<balance){
                    if(balance>500){
                        //500 is minimum amount in an account which we can't withdraw
                        System.out.println("Confirm the withdraw amount: "+ withdraw+ " press 1 for confirming the withdrawal and 0 for denying the withdrawal");
                        confirmation=c.nextInt();
                        if(confirmation==1){
                            System.out.println("Collect your cash");
                            current_balance=balance-withdraw;
                            System.out.println("Withdrawal is successfull!! Thank you and visit us again");
                            System.out.println("Current Balance: "+current_balance);
                            System.out.println("Remove Your card");
                            }
                            else{
                                System.out.println("Withdrawal is denied");
                        }
                    }
                    else{
                    System.out.println("balance is insufficient for withdrawal");
                }
                
                }
                else{
                    System.out.println("balance is insufficient for withdrawal");
        }
        break;
        
        case 3: 
            obj.check_balance();
            break;
            
        case 4:
            System.out.println("Exiting...");
            break;
            
        default:   
            System.out.println("Entered number is a invalid number, Enter a valid number!");
    }
            }
            else{
                System.out.println("Wrong Pin Number");
            }
        }
        else{
            System.out.println("Invalid Account number");
        }
    
}
}