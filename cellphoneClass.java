class cellphone{
    public void ringing(){
        System.out.println("ringing...");

    }
    public void vibrating(){
        System.out.println("vibrating...");

    }
}
public class cellphoneClass {
    
    public static void main(String[] args) {
        //making object of that class 
        cellphone nokia = new cellphone() ;
        nokia.vibrating();
        nokia.ringing();

    }
}
