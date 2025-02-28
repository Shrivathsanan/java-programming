import java.util.*;

class StringSpilt {  
    public static void main(String args[]) {
        System.out.println("Enter a string: ");
        Scanner c = new Scanner(System.in);
        String str = c.nextLine(); 
        c.close();

        
        String a[] = str.split("[ '?!,@._]+");

        
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty()) { 
                System.out.println(a[i]);
            }
        }
    }
}

