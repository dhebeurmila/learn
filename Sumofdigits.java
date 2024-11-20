import java.util.Scanner;

public class Sumofdigits{
    public static void SumOfDigits(int num){
      int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        SumOfDigits(num);
    }
}