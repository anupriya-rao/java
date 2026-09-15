public class q8 {
    public static void main(String[] args) {
        // min element
       int [] num = { 1 , 3, 45 , 56, 234 , 4556};
       int sort = num[0];
       for(int i = 0 ; i<num.length; i++){
        for(int j=i+1; j<num.length ; j++){
            if(num[i]>num[j]){
                int temp = num[i];
                num[i] =num[j];
                num[j] = temp;
            }
        }
       }
       for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
