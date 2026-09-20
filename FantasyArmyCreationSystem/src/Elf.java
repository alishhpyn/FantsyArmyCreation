public class Elf extends Unit{
    public Elf(){
        super("Elf",100,35);
    }
    @Override
    public void attack(){
        System.out.println("Elf attacks with a bow.");
    }
}
