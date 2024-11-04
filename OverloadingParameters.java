public class OverloadingParameters {
    public void print(int numbers){
        System.out.println("integers :"+numbers);
    }
    public void print(double numbers){
        System.out.println("double :"+numbers);
    }
    public void print(String text){
        System.out.println("String :"+text);
    }
    public static void main(String[] args) {
        OverloadingParameters obj = new OverloadingParameters();
        obj.print(5);
        obj.print(22.6);
        obj.print("urmila");

        
    }

}
