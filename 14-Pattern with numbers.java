class patterns{
    public static void main(String[] arge ){

        //INCREASING PATTERN
        // for(int i=1;i<=6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        

        //  INVERTED PATTERN
        // for(int i=6;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //INCREASING PATTERN WITH INCREASING NUMBER
        // int num=1;
        // for(int i=1;i<=6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        //INCREASING PATTERN WITH ALTERNATIVE 1 0 
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum % 2 == 0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                
                }
            }
            System.out.println();
        }
    }
}