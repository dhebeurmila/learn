public class Starpattern{
    public static void main (String[]args){
    int n=3;
    int m=6;
    for (int i=0;i<=n;i++){
        for (int j=0;j<=m;j++){
            if ((i==0&&j==3)||(i==1&&j==2)||(i==1&&j==4)||(i==2&&j==1)||(i==2&&j==3)||(i==2&&j==5)||(i==3&&j==0)||(i==3&&j==2)||(i==3&&j==4)||(i==3&&j==6))
        {
            System.out.print("*");
        }       
        else
        {
            System.out.print(" ");
        }
    }
        System.out.println();
     }
    }

}