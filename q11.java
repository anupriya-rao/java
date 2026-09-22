public class q11 {
    // recurssive funtiuon to print sum of first n natural numbers 
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
       System.out.println(sum(10));
    }

}
