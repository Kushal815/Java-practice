import java.util.*;


public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Charecter at a point
        System.out.println(sb.charAt(0));
        
        // Seting Charecter at a index (Replasing)
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // Inserting Charecter 
        sb.insert(2,'n');
        System.out.println(sb);

        //Deleating the extra 'n'  from the string
        sb.delete(2, 3);         //2nd index is not inclusive \
        System.out.println(sb);
        

        //Appending a char in string
        StringBuilder hsb = new StringBuilder("h");
        hsb.append('e');
        hsb.append('l');
        hsb.append('l');
        hsb.append('o');
        System.out.println(hsb);
     }    
}
