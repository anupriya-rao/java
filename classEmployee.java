class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class classEmployee {
    public static void main(String[] args) {
       employee pranshu = new employee();
       pranshu.setName("anupriya");
       pranshu.salary = 99111234 ; 
       System.out.println(pranshu.getName());
       System.out.println(pranshu.getSalary());
    } 
}
