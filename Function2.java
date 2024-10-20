import java.util.Scanner;
 public class Function2{
    public static int CalculateMul(int a,int b)
    {
    int mul=a*b;
    return mul;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=CalculateSMul(a,b);
        System.out.println("Multiplication of two numbers is:"+mul);
    }
 }
