public class Methodoverloading {
    public static void main(String args[]){
        Greet obj=new Greet();
        obj.greetings();
        obj.greetings("urmila");
    }
}
class Greet{
    void greetings(){
        System.out.println("hello,good morning");
    }
    void greetings(String name){
        System.out.println("hello" +name+",good morning");
    }
}
