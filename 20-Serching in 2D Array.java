import java.util.*;

class Serching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr num of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter num of colloms : ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        System.err.println("Ener the values in to the matrix : /n/n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.err.print("Enter the Element to be searched in the matrix : ");
        int ele =sc.nextInt();

        //Printing matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.err.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(ele == matrix[i][j]){
                    System.out.print("The elemnt exist at the coodinate : "+(i+1) +"  "+(j+1));
                }
            }
        }    
    }
    
}