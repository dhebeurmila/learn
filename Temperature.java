import java.util.Scanner;

public class Temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.converted temp from celcious to fahrenheit");
        System.out.println("2.converted temp from fahrenheit to celcious"); 
        System.out.println("choose an option 1 or 2") ; 
        int choose=sc.nextInt();
        System.out.println("enter the temperature");
        double temp=sc.nextDouble(); 

        if (choose==1){
           double fahrenheit=(temp*9/5)+32;
            System.out.println(temp+"c="+fahrenheit+"f");
        }
        else if(choose==2){
           double celcious=(temp-32)*5/9;
            System.out.println(temp+"f="+celcious+"c");
        }
        else{
            System.out.println("invalid option"); 
        }
        }

    }
