public class Singleton {
 static String str;
    
   
    private static Singleton singleInstance = new Singleton();
    
   
    private Singleton() {}
    
    
    public static Singleton getSingleInstance() {
        return singleInstance;
    }
    public static void main(String[] args) {
       
        Singleton instance = Singleton.getSingleInstance();
        
        str = "hello world";
        
    
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }
}
