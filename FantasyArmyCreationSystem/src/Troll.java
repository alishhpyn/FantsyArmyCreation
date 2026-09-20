public class Troll extends Unit {

    private static final int TROLL_HEALTH = 250;
    private static final int TROLL_DAMAGE = 30;

    public Troll() {
        super("Troll", TROLL_HEALTH, TROLL_DAMAGE);
    }

    @Override
    public void attack() {
        System.out.println("Troll attacks with a club.");
    }
}