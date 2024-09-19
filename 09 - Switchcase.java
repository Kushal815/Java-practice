dimport java.util.*;
class sc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.err.print("Sunday");
                break;
            case 2:
                System.err.print("Monday");
                break;
            case 3:
                System.err.print("Tuesday");
                break;
            case 4:
                System.err.print("Wednesday");
                break;
            case 5:
                System.err.print("Thursday");
                break;
            case 6:
                System.err.print("Friday");
                break;
        
            case 7:
                System.err.print("Saturday");
                break;
        
            default:
                System.err.print("Invalid Number");
                break;
        }
    }
}
