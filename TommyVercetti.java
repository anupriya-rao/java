class Tommy{
    public void hitting(){
        System.out.println("hitting....");
    }
    public void running(){
        System.out.println("running....");
    }
}
public class TommyVercetti {
    public static void main(String[] args) {
        Tommy game = new Tommy();
        game.running();
        game.hitting();
    }
}
