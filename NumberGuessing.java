import java.util.Scanner;
import java.util.Random;

public class NumberGuessing{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
         
       int numberToGuess=rand.nextInt(100)+1;
       int userGuess=0;
       
       System.out.println("enter the no between 1 to 100");

       while(true){
        userGuess=sc.nextInt();
        
        if(userGuess==numberToGuess){
            System.out.println("you guess correct no");
            break;
        }else if(userGuess<numberToGuess){
            System.out.println("too small try again");
        }else{
            System.out.println("too big try again");
        }
       }

    }
}