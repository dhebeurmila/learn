public class Overloading2 {
    public void print(int a){
        System.out.println("a ="+a);
    }
    public void print(int a,String text ){
        System.out.println("a ="+a+",text="+text);
    }
    public void print(int a,String text,double num){
        System.out.println("a ="+a+",text="+text+",num="+num);
    }
    public static void main (String [] args){
        Overloading2 obj=new Overloading2();
        obj.print(5);
        obj.print(5,"urmila");
        obj.print(5,"urmila",10.9);
        
    }
    }
