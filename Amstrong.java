/*** Amstrong number */

//153 = 1*1*1+5*5*5+3*3*3

class Amstrong{ 

static int input = 153;
static int reference = input;
static int remainder;
static int result=0;

public void amstrong(){

while(input>0){
remainder=input%10;
input=input/10;
result=result+(remainder*remainder*remainder);
}
}
public static void main(String args[]){

Amstrong object = new Amstrong();
object.amstrong();

if(result==reference){
System.out.println("The number " + reference +" is a amstrong number");
}
else{
System.out.println(reference + " is not a amstrong number");
}
}
}