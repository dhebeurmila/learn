
public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) { 
        Overloading obj=new Overloading();
        System.out.println("sum of 5 and 5 : "+obj.add(5,5));
        System.out.println("sum of 4,5 and 5 : "+obj.add(4,5,5));
    }

}
