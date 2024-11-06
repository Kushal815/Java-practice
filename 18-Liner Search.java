import java.util.*;


 class search{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.err.println("Enter "+ size +" Elemnts to the array : ");
        int ar[]= new int[size];

        for(int i=0;i<size;i++){
            ar[i] = sc.nextInt();
        }
        
        System.err.println("Enter the Number to be searched in the array : ");
        int ele = sc.nextInt();
        for(int i=0;i<ar.length;i++){
            if (ele==ar[i]) {
                System.err.println("The element "+ ele +" is at the postion of "+(i+1));
                
            }
            
        }
        // else{
        //     System.err.println("The element "+ele+ " does not exist");
        // }
    }
}
