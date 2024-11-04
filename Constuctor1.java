class Test{
    int a,b,sum;
    public Test(int even,int odd){
        a=even;
        b=odd;
        sum=a+b;
    }
    void print(){
        System.out.println("sum of two number is :" + sum);
    } 
}
public class Constuctor1 {
    public static void main(String[] args) {
        Test T1=new Test(2,3);
        T1.print();
        
    }

}
