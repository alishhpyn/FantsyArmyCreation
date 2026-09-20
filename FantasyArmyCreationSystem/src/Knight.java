public class Knight extends Unit{
    public Knight(){
        super("Knight",150,25);
    }
    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword.");
    }
}

