import java.util.*;

class Grade{

static int number_of_subject;
static  int total_mark=0;
static float average=0.0f;
static int subject;

public static void main(String args[]){
    Scanner c=new Scanner(System.in);
    System.out.println("Enter Total number of subject: ");
    number_of_subject=c.nextInt();
    
    int arr[]=new int[number_of_subject];
    
    System.out.println("\n Enter the marks obtained: ");
    for(int i=0;i<number_of_subject;i++){
        arr[i]=c.nextInt();
    }
    for(int i=0;i<number_of_subject;i++){
        total_mark=total_mark+arr[i];
    }
    System.out.println("\n Total Marks obtained : "+ total_mark);
    average=total_mark/number_of_subject;
    System.out.println("\n Average of the subjects: "+ average+ " %");
    
    if((average<=100)&&(average>=90)){
        System.out.println("\n The Grade obtained is : O ");
    }
    else if((average<90)&&(average>=80)){
        System.out.println("\n The Grade obtained is : A+");
    }
    else if((average<80)&&(average>=70)){
        System.out.println("\n The Grade obtained is : A");
    }
    else if((average<70)&&(average>=60)){
        System.out.println("\n The Grade obtained is : B+");
    }
    else if((average<60)&&(average>=50)){
        System.out.println("\n The Grade obtained is : B");
    }
    else if((average<50)&&(average>=45)){
        System.out.println("\n The Grade obtained is : c");
    }
    else{
        System.out.println("\n average is Too low !!");
    }
}
}
