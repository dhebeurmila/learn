import java.util.Scanner;

public class Largestnumber{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of elements");
      int n=sc.nextInt();
      int arr[]=new int[n];

      System.out.println("enter "+n+" numbers");
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
}
int largest=arr[0];
for(int i=1;i<n;i++){
  if (arr[i]>largest){
    largest=arr[i];
  }
}
System.out.println("largest no = "+largest);
}
}