import java.util.*;
class func {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        printMyName(name);
    }
}

//SUM OF 2 NUMBERS
class addFunction{

    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Numbers : ");
        int b=sc.nextInt();
        int a=sc.nextInt();

        int total=add(b, a);
        System.err.println("Sum of "+a+" and "+b+" are : "+total);
    }
}



//PRODUCT OF 2 NUMBERS 
class PRODUCT{

    public static int Product(int n1,int n2){
        return n1*n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Numbers : ");
        int b=sc.nextInt();
        int a=sc.nextInt();

 
        System.err.println("Product of "+a+" and "+b+" are : "+Product(a,b));
    }
}

//FACTORIAL OF A NUMBER 
class factorial{
    public static int facto(int a) {
        if(a <= 0){
            System.err.println("invalid number");
            
        }
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Numbers : ");
        int n=sc.nextInt();

        System.err.println(facto(n));

    }
}
