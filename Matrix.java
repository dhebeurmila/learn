import java.util.Scanner;

 public class Matrix{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows");
    int rows=sc.nextInt();
    System.out.println("enter the cols");
    int cols=sc.nextInt();
    
        int[][]matrix1=new int[rows][cols];
        int[][]matrix2=new int[rows][cols];
        int[][]result=new int[rows][cols];

        System.out.println("enter the first matrix element");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second matrix element");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            result[i][j]=matrix1[i][j]+matrix2[i][j];
         }
        }
        System.out.println("resultant matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.print(result[i][j]+" ");
        }
     System.out.println();
    }
}
 }