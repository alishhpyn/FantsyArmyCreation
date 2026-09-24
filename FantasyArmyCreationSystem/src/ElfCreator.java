public class ElfCreator extends UnitCreator {
    @Override
    public IUnit createUnit(){
        return new Elf();
    }
}
