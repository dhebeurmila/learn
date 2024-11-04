import java.util.Scanner;
public class Fibonacci{
    public static void generateFibonacci(int n){
        int a=0;
        int b=1; 
        System.out.println("Fibonacci sequence:" +a  +b);
        for(int i=1;i<n;i++){
            int next=a+b;
            System.out.println(" "+next);
            a=b;
            b=next; 
        }
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of trems of fibbonacci no");
            int n=sc.nextInt();
            generateFibonacci(n);
        }
    }
