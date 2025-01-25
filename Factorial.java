import java.util.*;

class Factorial{
static int fact=1;
static int number=5;

public void factorial(){

for(int i=1;i<=number;i++){

fact=fact*i;

}
}

public static void main(String args[]){

Factorial obj = new Factorial();
obj.factorial();

System.out.println(" factorial value of " + number + " is " + fact);

}
}