class cylinder{
    // use getters and setters to set radius and height of cylinder
    int radius;
    int height;
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setRadius(int radius) {
        this.radius= radius;
    }
    public int getRadius() {
        return radius;
    }
}
public class q13 {
    public static void main(String[] args) {
       cylinder c1 = new cylinder();
       c1.setHeight(5);
       c1.setRadius(12);
       System.out.println(c1.getHeight());
       System.out.println(c1.getRadius());
    }
}
