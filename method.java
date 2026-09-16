public class method {
    static int logic(int x , int y , int z){
        int a ;
        if(x==y && x==z){
            a = x+y+z;
        }
        else{
            a = x-y+z;
        }
        return a;
    }
    public static void main(String[] args) {
        int x = 98;
        int y = 89;
        int z = 19;
        int a ;
        a = logic(x, y, z);
        System.out.println(a);

    }
}
