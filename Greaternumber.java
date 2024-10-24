import java.util.Scanner;
public class Greaternumber {
 public static void greaterNumber(int a,int b){
    if(a>b){
        System.out.println("number is greater");
    }else{
        System.out.println("number is smaller");
    }
    return ;
 }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    greaterNumber(a, b);
 }
}
