public class while_break {
    public static void main(String[] args) {
        int i = 1;
        while(i<10){
            System.out.println("this is java");
            System.out.println(i);
            if(i==3){
                System.out.println("loop has ended");
                continue;
            }
            i++;
        }

    }
}
