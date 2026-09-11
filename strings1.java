public class strings1 {
    public static void main(String[] args) {
        String name = "PRANSHU";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String l1string = name.toUpperCase();
        System.out.println(l1string);
        String nonTrim = "    Pranshu       ";
        System.out.println(nonTrim.trim());
        System.out.println(name.substring(2,5));

    }
}
