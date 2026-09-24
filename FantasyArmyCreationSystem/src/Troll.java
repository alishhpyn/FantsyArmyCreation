public class Troll extends AbstractUnit {

    public Troll() {
        super("Troll", 200, 30);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a club.");
    }
}