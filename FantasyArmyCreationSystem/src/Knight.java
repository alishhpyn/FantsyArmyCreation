public class Knight extends Unit {

    private static final int KNIGHT_HEALTH = 150;
    private static final int KNIGHT_DAMAGE = 25;

    public Knight() {
        super("Knight", KNIGHT_HEALTH, KNIGHT_DAMAGE);
    }

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword.");
    }
}