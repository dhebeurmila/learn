 /**  class Test{
    int num1;
    int num2;
    public Test(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
public int add(){
    return num1 + num2;
}
public int sub(){
    return num1 - num2;
}
public int mul(){
    return num1 * num2;
}
public double div(){
    if(num2!=0){
        return(double)num1/num2;
    }else{
        System.out.println("cannot divided by zero");
        return 0;
    }
}

public class Calculator  {
    public static void main(String[] args) {
        Test T1=new Test(20, 4);
        System.out.println("Addition :"+T1.add());
        System.out.println("subtraction :"+T1.sub());
        System.out.println("multiplication :"+T1.mul());
        System.out.println("division :"+T1.div());

    }

}
 }*/


 class Test{
    int a;
    int b;
    public Test(){
        a=20;
        b=5;
    }
    public int add(){
        System.out.println("addition :" );
        return a+b;
    }
    public int sub(){
        System.out.println("subtraction :" );
        return a-b;
    }
    public int mul(){
        System.out.println("multiplication :" );
        return a*b;
    }
    public double div(){
        if(a!=0){
        System.out.println("division :" );
        return a+b;
        }else{
            System.out.println("cannot divided by zero");
            return 0;
        }
    }
         public class Calculator{
            public static void main(String[] args) {
                Test T1=new Test();
                T1.add();
                T1.sub();
                T1.mul();
                T1.div();

                
            }
            
        }

 }
