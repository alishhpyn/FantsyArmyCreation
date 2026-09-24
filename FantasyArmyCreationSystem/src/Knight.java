public class Knight extends AbstractUnit {

    public Knight() {
        super("Knight", 150, 25);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a sword.");
    }
}