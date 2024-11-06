class paterns{
    public static void main(String[] args) {
        int n = 5;
        
        //UPPER HALF
        for(int i=1;i<=n;i++){
            //1st HALF
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //LOWER HALF
        for(int i=n;i>=1;i--){
            //1st HALF
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
class rompat{
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            //Space
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            
            }
            //Stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class numpiramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}   

class center_num_pattern{
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");

            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class diamond{
    public static void main(String[] args) {
        int n=4;

        //Upper half
        for(int i=0;i<=n;i++){
            for(int j=0;j<=(n-i);j++){
                System.out.print("  ");

            }
            for(int j=1;j<=(2*i-1);j++){
                System.err.print("* ");
            }
            
            System.err.println();
        }

        //Lower half
        
        for(int i=n;i>=1;i--){
            for(int j=0;j<=(n-i);j++){
                System.out.print("  ");

            }
            for(int j=1;j<=(2*i-1);j++){
                System.err.print("* ");
            }
            
            System.err.println();
        }
    }
}