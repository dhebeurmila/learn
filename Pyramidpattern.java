public class Pyramidpattern{
    public static void main(String args[]){
        int n=4;
        int m=7;
        for (int i=1;i<=n;i++){
            for(int j=0;j<=m;j++)
            if((i==1&&j==4)||(i==2&&j==3)||(i==2&&j==5)||(i==3&&j==2)||(i==3&&j==4)||(i==3&&j==6)||(i==4&&j==1)||(i==4&&j==3)||(i==4&&j==5)||(i==4&&j==7)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
          System.out.println();
    }
  }
}