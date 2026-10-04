public class employee {

    int empId;
    String empName;
    double basicSalary;

    static String companyName = "Google";

    employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    double calculateSalary(double bonusPercentage) {
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Company : " + companyName);
    }

    public static void main(String[] args) {

        employee[] employees = new employee[3];

        employees[0] = new employee(1, "Anu", 50000);
        employees[1] = new employee(2, "Riya", 60000);
        employees[2] = new employee(3, "Aman", 70000);

        employees[0].display();
        System.out.println("Salary : " + employees[0].calculateSalary());
        System.out.println("Salary with bonus : " + employees[0].calculateSalary(10));

        employees[1].display();
        System.out.println("Salary : " + employees[1].calculateSalary());
        System.out.println("Salary with bonus : " + employees[1].calculateSalary(20));

        employees[2].display();
        System.out.println("Salary : " + employees[2].calculateSalary());
        System.out.println("Salary with bonus : " + employees[2].calculateSalary(15));
    }
}