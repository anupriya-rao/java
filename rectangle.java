public class rectangle {
    //Create a class Rectangle with length and breadth. Add a constructor and methods area() and perimeter(). Create 3 objects using an array and display their details.
    int length = 0 ;
    int breadth = 0;
    rectangle(int length , int breadth){
        this.length = length ;
        this.breadth = breadth;
    }
    rectangle(){
        int length = 0;
        int breadth = 0;
    }
    void area(){
        System.out.println("area = " + (length*breadth));
    }
    void perimeter(){
        System.out.println("perimeter is " + 2*(length+breadth));
    }
    void display(){
        System.out.println("length = " + length);
        System.out.println("breadth = " + breadth);
        area();
        perimeter();
    }

    
    public static void main(String[] args) {
        rectangle[] r = new rectangle[3];
        r[0] = new rectangle(8, 2);
        r[1] = new rectangle(5, 4);
        r[2] = new rectangle(6, 3);
        for(int i = 0; i < 3; i++) {
            r[i].display();
        }

    }
}
