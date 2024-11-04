class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void employeeDetails(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("salary:"+salary);
    }
}
public class This2 {
    public static void main(String[] args) {
        Employee obj=new Employee(1, "abc", 20000);
        obj.employeeDetails();
    }

}
