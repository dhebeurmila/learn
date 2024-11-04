class Student{
    String name;
    int age;
    String grade;
    Student(){
        name="unknown";
        age=0;
        grade="not assigned";
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(String name,int age,String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("grade : "+grade);
    }

}
public class ConstructorOverlaoding {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.displayDetails();
        Student s2=new Student("abc",23);
        s2.displayDetails();
        Student s3=new Student("xyz",32,"A");
        s3.displayDetails();   
    }
}
