public class Elf extends Unit {

    private static final int ELF_HEALTH = 100;
    private static final int ELF_DAMAGE = 35;

    public Elf() {
        super("Elf", ELF_HEALTH, ELF_DAMAGE);
    }

    @Override
    public void attack() {
        System.out.println("attacks with a bow.");
    }
}