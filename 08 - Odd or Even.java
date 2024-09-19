import java.util.*;
class number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();


        if (num % 2==0) {
            System.err.println("Even");
        }
        else{
            System.err.println("Odd");
        }
    }
}