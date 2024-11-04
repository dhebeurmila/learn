class Rectangle{
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int CalculateArea(){
        return length*width;
    }
}
public class Area {
    public static void main(String[] args) {
     Rectangle obj=new Rectangle(20, 40);
     System.out.println("Area of rectangle is :" +obj.CalculateArea());
       
     
    }

}
