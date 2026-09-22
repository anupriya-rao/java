class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
public class squareClass {
    public static void main(String[] args) {
        square yellow = new square();
        yellow.side = 2;
        System.out.println("side = " + yellow.side);
        System.out.println("area = " + yellow.area());
        System.out.println("perimeter = " + yellow.perimeter());

    }
}
