class Book{
    String tittle;
    String author;
    double price;
    Book(String tittle,String author,double price){
        this.tittle=tittle;
        this.author=author;
        this.price=price;
    }
    void displayDetails(){
        System.out.println("tittle :"+tittle);
        System.out.println("author :"+author);
        System.out.println("price :"+price);
    }
}
public class This1 {
    public static void main(String[] args) {
        Book B1=new Book("xyz","abs",200);
        B1.displayDetails();

    }
}
