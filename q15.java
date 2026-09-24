class student{
    String name;
    int age;
    student(String name , int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class q15 {
    public static void main(String[] args) {
        student s1 = new student("anupriya", 20);
        s1.display();
    }
}
