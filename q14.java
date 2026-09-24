class cylinder{
    int radius ; 
    int height;
    cylinder(int radius , int height){
        this.radius = radius;
        this.height = height ;
    }
    void display(){
        System.out.println(height);
        System.out.println(radius);
    }
        // use cosntructor in this 
}
public class q14 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(7 , 20);
        c1.display();
    }
}
