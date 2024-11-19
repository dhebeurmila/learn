import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();

        int originalNumber=n;
        int sum=0;

            while(n>0){
             int digit=n%10;
             sum=sum+digit*digit*digit;
             n/=10;
            }
         if(sum==originalNumber){
            System.out.println(originalNumber+" is an armstrong no");
            }else{
                System.out.println(originalNumber+"is not an armstrong no");
            }
         }
    }
