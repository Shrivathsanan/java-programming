/*** String Methods */


class StringMethods{
    
    public static void main(String args[]){
        String str = new String(" Java is easy to learn ");
        String str1="Java is a high level programming language";
        String str2=" Java is easy to learn ";
        
        //String Methods
        
        //1
        str=str.trim();
        System.out.println(str);
        str2=str2.trim();
        System.out.println(str2);
        
        //2 
        
        System.out.println(str.charAt(7));
        
         //3 
        
        System.out.println(str.equals(str2));
        
         //4 
        
        System.out.println(str==str2);
        
         //5 
        
        System.out.println(str.equalsIgnoreCase(str2));
        
         //6 
        
        System.out.println(str.codePointAt(7));
        
         //7 
        
        System.out.println(str.codePointBefore(7));
        
        //8
        
        System.out.println(str.codePointCount(0,10));
        
        //9
        
        System.out.println(str.contains("is"));
        
        //10
        
        System.out.println(str.startsWith("Java"));
        
        //11
        
        System.out.println(str.endsWith("learn"));
        
        //12
        
        char ch[]=str.toCharArray();
        
        System.out.println(String.valueOf(ch));
        
        //13
        
        System.out.println(str.hashCode());
        
        //14
        
        String empty="";
        
        System.out.println(empty.isBlank());
        
        //15
        
        System.out.println(empty.isEmpty());
        
        //16
        
        System.out.println(str.getClass());
        
        //17
        
        System.out.println(str.getBytes());
        
        /*will not print the actual bytes of the string. Instead, it will print the memory reference of the byte array*/
        
        //18
        
        System.out.println(str.replace("J" , "j"));
        
        //19
        
        System.out.println(str.replaceFirst("e","E"));
        
        
        //20
    
        System.out.println(str.replaceAll(str ,str1));
        
        
        //21
        
        System.out.println(str.substring(7));
        
        //22
        
        System.out.println(str.concat(" and easy to understand"));
        
        //23
        
        System.out.println(str.indexOf("i"));
        
        //24
        
        System.out.println(str.toUpperCase());
        
        //25
        
        System.out.println(str.toLowerCase());
        
        //26
        
        String str3 = new String("Java is easy to learn").intern();
        String str4="Java is easy to learn";
        
        System.out.println(str3==str4);
        
        //27
        
        System.out.println(str.compareTo(str2));
        
        //28
        
        System.out.println(str.length());
        
        //29
        
        String a[]=str.split("a");
        
        System.out.println();
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }

        //30
        System.out.println();
        System.out.println(str.compareToIgnoreCase(str2));
    }
}