public class varArgs {
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result =+0;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("sum of 4,5 is" + sum(4,5));
    }
}
