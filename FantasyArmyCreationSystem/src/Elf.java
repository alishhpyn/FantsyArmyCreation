public class Elf extends AbstractUnit {

    public Elf() {
        super("Elf", 90, 35);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a bow.");
    }
}