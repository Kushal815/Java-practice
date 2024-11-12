import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Declaration and input of string

        // it just takes the first word in the sring before the first space
        String name =  sc.next();
        
        // it take the input of the compleete line as a string 
        String fullname =  sc.nextLine();
        
        System.err.println("The name is : "+name);
        System.err.println("The name is : "+fullname);
    }    
}


class accessinAllElementsOfString {
    public static void main(String[] args) {
        
        String fname = "Tony";
        String sname = "Stark";
        String fullname = fname + " " + sname;

        System.out.println(fullname.length());

        for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));         //  charAt   is used to access the single charecter of the string at a mentioned positione
        }
    }
}


class comparingOfString {
    public static void main(String[] args) {
        
        String n1 = "Tony";
        String n2 = "Tony";

        // 1  s1 > s2 : +ve value
        // 2  s1 == s2 : 0 value
        // 1  s1 < s2 : <ve value


        if(n1.compareTo(n2)== 0){
            System.out.println("The String Are Equal")
        }

        else{
            System.out.println("The String Are Not Equal")
        }
    }
}


class substringsConcept {
    public static void main(String[] args) {
        
        // String sent = "My name is tony";
        // String substr = sent.substring(11,sent.length());
        
        // String sent = "TonyStark";
        // String substr = sent.substring(0,4);
        
        String sent = "TonyStark";
        String substr = sent.substring(4);



        System.out.println(substr);
    }
}