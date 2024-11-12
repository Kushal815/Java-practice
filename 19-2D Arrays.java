import java.util.*;

class t2D_Arrays {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number of rows :");
        int r=sc.nextInt();
        System.err.print("Enter Number of colloms :");
        int c=sc.nextInt();


        int[][] matrix = new int[r][c];
        System.err.println("Ener the values in to the matrix : /n/n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //Printing matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.err.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}