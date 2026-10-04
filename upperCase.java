import java.util.Scanner;
public class upperCase {
    //Write a program to read a string from the user and print it in uppercase along with its length.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String s1 = sc.next();
        System.out.println(s1.toUpperCase());

    }
}
