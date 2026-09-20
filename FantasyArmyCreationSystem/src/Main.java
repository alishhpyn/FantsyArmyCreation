
class Main {

    public static void main(String[] args) {

        System.out.println("=== Factory Method ===");

        UnitCreator knightCreator = new KnightCreator();
        UnitCreator elfCreator = new ElfCreator();
        UnitCreator trollCreator = new TrollCreator();

        Unit knight = knightCreator.createUnit();
        Unit elf = elfCreator.createUnit();
        Unit troll = trollCreator.createUnit();

        knight.attack();
        elf.attack();
        troll.attack();


        System.out.println("\n=== Abstract Factory ===");

        ArmyEquipmentFactory knightFactory =
                new KnightEquipmentFactory();

        Weapon knightWeapon = knightFactory.createWeapon();
        Armor knightArmor = knightFactory.createArmor();

        knightWeapon.use();
        knightArmor.protect();


        ArmyEquipmentFactory elfFactory =
                new ElfEquipmentFactory();

        Weapon elfWeapon = elfFactory.createWeapon();
        Armor elfArmor = elfFactory.createArmor();

        elfWeapon.use();
        elfArmor.protect();
    }
}