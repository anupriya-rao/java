import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for rock , 0 for scissors 0and 2 for paper");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput ==  0 && computerInput == 2 || userInput ==  1 && computerInput == 0 || userInput ==  2 && computerInput == 1 ){
            System.out.println("you win");
        }
        else{
            System.out.println("computer win");
        }

    }
}
