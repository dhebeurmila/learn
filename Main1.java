import java.util.Scanner;


public class Main1{
    
   /*  public static int printFactorial(int n){
       int factorial=1;
       for (int i=1;i<=n;i++){
          factorial= factorial*i;
       }
       System.out.println(factorial);
       return factorial;
    }

       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a no");
             int n=sc.nextInt();
            printFactorial(n);
       }
    }
*/

/*public static int sumOfNaturalNo(int n){
    int sum=0;
    for(int i=0;i<=n;i++){
        sum  =+i;
          System.out.println(sum);
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
System.out.println("enter a no");
int n=sc.nextInt();
sumOfNaturalNo(n);
}
}
  */
 /*  public static void fibonacciNo(int n){
    int a=0;
    int b=1;
    System.out.println("fibonacci sequence is: " +a  +b);
    for(int i=0;i<=n;i++){
        int next=a+b;
        System.out.println(" "+next);
        a=b;
        b=next;
    }
}
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of term for fibonacci no");
    int n=sc.nextInt();
    fibonacciNo(n);   
 }
} */

 /*public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter "+n+" elements");
    for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
    }

    int largest=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
        largest=arr[i];
    }
}
System.out.println("largest element is :" +largest);
}
}
*/
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements " +n);
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int smallest=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
        }
    }
    System.out.println("smallest element is :" +smallest);
 }
}

