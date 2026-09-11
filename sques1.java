public class sques1 {
    public static void main(String[] args) {
        String name = "Pranshu";
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(' ', '_'));
        String letter1 = " \" Dear ";
        String letter2 = " , thanks a lot\" ";
        System.out.println(letter1 + name + letter2);
        String space = "it has   so many spaces  ";
        System.out.println(space.indexOf("  "));

    }
}
