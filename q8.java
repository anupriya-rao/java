public class q8 {
    public static void main(String[] args) {
        // min element
       int [] num = { 1 , 3, 45 , 56, 234 , 4556};
       int min = num[0];
       for(int i = 0 ; i<num.length; i++){
        if(num[i]<min){
            min=num[i];
        }
       }
       System.out.println(min);
    }
}
