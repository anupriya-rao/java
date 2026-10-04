public class student {
    //Create a class Student (rollNo, name, marks) with a constructor and setters and getters. Create 4 objects using an array and display the student with the highest marks.
     int rollNo ;
     int marks ;
     String name ;
    student(int rollNo , int marks , String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void display( ){
        System.out.println(getRollNo());
        System.out.println(getMarks());
        System.out.println(getName());
    }
    public static void main(String[] args) {
        student[] arr = new student[3];
        arr[0] = new student(1, 25, "shreya");
        arr[1] = new student(2, 27, "kullu");
        arr[2] = new student(3, 30, "anupriya");

        student highest = arr[0] ;
        for(int i = 1 ; i<3 ; i++){
            if(arr[i].getMarks() > highest.getMarks()){
                highest = arr[i] ;
            }
        }
        highest.display();
    }
}
