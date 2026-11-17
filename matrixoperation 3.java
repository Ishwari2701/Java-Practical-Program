import java.util.Scanner;
public class matrixoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int A[][] = new int[r1][c1];
        System.out.println("Enter matrix A: ");
        for(int i=0; i<r1; i++)
            for(int j=0; j<c1; j++)
        A[i][j]=sc.nextInt();
    System.out.println("Enter rows and columns of matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int B[][] = new int[r2][c2];
        System.out.println("Enter matrix B: ");
        for(int i=0; i<r2; i++)
            for(int j=0; j<c2; j++)
        B[i][j] = sc.nextInt();
        System.out.println("Enter rows and columns of matrix B: ");

        //Addition Of Two Matrices
        if(r1 == r2 && c1 == c2) {
            System.out.println("\nAddition of Two matrices: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++)
                    System.out.println(A[i][j] + B[i][j] + " ");
                System.out.println();
            }
                
        }

        //Multiplication Of Two matrices
        if(c1 == r2){
            int C[][] = new int[r1][c2];
            System.out.println("\nMultiplication Of Two Matrices: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++)
                    C[i][j] += A[i][k] * B[k][i];
                System.out.println(C[i][j] + " ");
                }
            }
               //Transpose Of Matrix
               System.out.println("\nTranspose of Matrix: ");
               for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++)
                    System.out.println(A[i][j] + " ");
                    System.out.println();

               }

              //Row wise Sum
              System.out.println("\nRow Sum: ");
              for(int i=0; i<r1; i++){
                int sum = 0;
                for(int j=0;  j<c1; j++)
                    sum +=A[i][j];
                System.out.println(sum);
              }
                //Column wise sum
                System.out.println("\nColumn Sum: ");
                for(int j=0; j<c1; j++){
                    int sum=0;
                    for(int i=0; i<c1; i++)
                        sum += A[i][j];
                        System.out.println(sum);
                }
                sc.close();
        }

    }
}