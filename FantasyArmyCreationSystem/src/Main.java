class Main{
    public static void main(String[] args){
        UnitCreator knightCreator = new KnightCreator();
        UnitCreator elfCreator = new ElfCreator();
        UnitCreator trollCreator = new TrollCreator();

        Unit knight = knightCreator.createUnit();
        Unit elf = elfCreator.createUnit();
        Unit troll = trollCreator.createUnit();

        knight.attack();
        elf.attack();
        troll.attack();

    }

}