public class Troll extends Unit{
    public Troll(){
        super("Troll",250,30);
    }
    @Override
    public void attack() {
        System.out.println("Troll attacks with a club.");
    }
}
