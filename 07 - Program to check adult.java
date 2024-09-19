import java.util.*;
class age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age>18) {
            System.err.println("Adult");
        }
        else{
            System.err.println("Minor");
        }
    }
}
