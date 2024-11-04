

class Numbers{
    int a,b,sum;
    public Numbers(){
        a=3;
        b=5;
        sum=a+b;
        System.out.println("creating  a new objects");
    }
    void print(){
        System.out.println(a+"+"+b);
        System.out.println("sum of two numbers= " +sum);
    }
}
public class Constructor {
public static void main(String[] args) {
    Numbers num1=new Numbers();
    num1.print();
}
    
}
