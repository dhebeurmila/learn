import java.util.Scanner;
public class Average {
    public static double printAverage(double num1,double num2,double num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double num1=sc.nextDouble();
        System.out.println("enter the second number");
        double num2=sc.nextDouble();
        System.out.println("enter the third number");
        double num3=sc.nextDouble();
        Average avg=new Average();
        double result=avg.printAverage(num1,num2, num3);
        System.out.println("the average is:"+result);
    }

}
