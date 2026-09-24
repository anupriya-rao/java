class employee{
    // overload a constructor to initiliaze salary to 10,000 
    String name ;
    int salary ;
    employee(){
        salary = 10000;
    }
    employee(String name ,int salary){
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(salary);
    }
    
}
public class constructorOverload {
    public static void main(String[] args) {
        employee e1 = new employee(" pranshu" , 1000000);
        e1.display();
        employee e2 = new employee("Anupriya", 90000);
        e2.display();

    }
}
