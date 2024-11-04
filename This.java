class Book{
    String tittle;
    String author;
    double price;
    Book(){
        this.tittle="ABC";
        this.author="XYZ";
        this.price=1000;
    }
    void displayDetails(){
        System.out.println("tittle :"+tittle);
        System.out.println("author :"+author);
        System.out.println("price :"+price);
    }
}
public class This {
    public static void main(String[] args) {
        Book obj=new Book();
        obj.displayDetails();
    }

}
