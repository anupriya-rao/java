public class pallindrome {
    public static void main(String[] args) {
       // Write a program to read a string and check whether it is a palindrome.
       String str = "madam";
       String rev = "";
       for(int i = 4 ; i>=0; i--){
        rev = rev + str.charAt(i);
       }
       if(str.equals(rev)){
        System.out.println("it is palindrome");
       }
       else{
        System.out.println("it is not palindrome");
       }

    }
}
