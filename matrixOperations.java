import java.util.Scanner;
public class matrixOperations {
    static int m1,n1,m2,n2;
    //Function starts here where we add two matrix
    static void addMatrix(int M1[][],int M2[][],int result[][]){
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                result[i][j]=M1[i][j]+M2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //Function starts here where we subtract two matrix
    static void subtractMatrix(int M1[][],int M2[][],int result[][]){
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                result[i][j]=M1[i][j]-M2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //Function starts here where we multiply two matrix
    static void matrixMultiplication(int M1[][],int M2[][],int result[][]){
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                result[i][j]=0;
                for(int k=0; k<n1; k++){
                    result[i][j] += M1[i][k]*M2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of first matrix = ");
        m1 = sc.nextInt();
        n1 = sc.nextInt();
        System.out.println("Enter the order of second matrix = ");
        m2 = sc.nextInt();
        n2 = sc.nextInt();
        int M1[][] = new int [m1][n1];
        int M2[][] = new int [m2][n2];
        System.out.println("enter the element of first matrix :");
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                M1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element of second matrix :");
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                M2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the opereation that you want to peroform between two matrix (+,-,*) :");
        String opereation = sc.next();
        switch(opereation){
            case "+": if(m1==m2 && n1==n2){
                        int result[][] = new int [m1][n2];
                        addMatrix(M1, M2, result); 
                    }
                    else{
                        System.out.println("Sorry! we can not perform this operation on these matrix ");
                    }
            break;
            case "-": if(m1==m2 && n1==n2){
                        int result[][] = new int [m1][n2];
                        subtractMatrix(M1, M2, result); 
                    }
                    else{
                        System.out.println("Sorry! we can not perform this operation on these matrix ");
                    }
            break;
            case "*": if(n1==m2){
                        int result[][] = new int[m1][n2];
                        matrixMultiplication(M1, M2, result);
                    }
                    else{
                        System.out.println("Sorry! we can not perform this operation on these matrix");
                    }
            break;
            default : System.out.println("invalid operation");
        }
        sc.close();
    }
}