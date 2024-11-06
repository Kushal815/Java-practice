
import java.util.*;

 class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 92;
        marks[3] = 93;

        // // Printing Individually

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        // Pringing Using Loop 
        
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }



    }
}




 class b_array2 {
    public static void main(String[] args) {
        int marks2[] = {91,92,93,94};


        for(int i=0;i<4;i++){
            System.out.println(marks2[i]);
        }

    }
    
}



// Arrya input from user


 class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }

    }
    
}