public class method {
    static int logic(int x , int y){
        int z ;
            if(x>y){
                z = (x*y);
            }
            else{
                z = (x+y);
            }
            return z;

        }
    public static void main(String[] args) {
        int x = 8;
        int y = 6;
        int z = logic(x, y);
        System.out.println(z);
       
    }
}
