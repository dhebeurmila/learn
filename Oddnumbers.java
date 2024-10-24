import java.util.Scanner;
public class Oddnumbers {
    public static int sumofOddNumbers(int n){
        int sum=0;
        for(int i=1;i>=1;i++){
            if(i%2!=0){
                sum=sum+1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=sumofOddNumbers(n);
        System.out.println("the sum of all odd numbers from 1 to " +n +" is" +sum);
    }

}
