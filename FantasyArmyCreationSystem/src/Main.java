public class Main {

    public static void main(String[] args) {

        // Factory Method
        System.out.println("=== Factory Method ===");

        UnitCreator knightCreator = new KnightCreator();
        IUnit knight = knightCreator.createUnit();

        UnitCreator trollCreator = new TrollCreator();
        IUnit troll = trollCreator.createUnit();

        System.out.println("\nCreated units:");

        System.out.println(knight.getName());
        System.out.println("Health: " + knight.getHealth());
        System.out.println("Damage: " + knight.getDamage());
        knight.attack();

        System.out.println();

        System.out.println(troll.getName());
        System.out.println("Health: " + troll.getHealth());
        System.out.println("Damage: " + troll.getDamage());
        troll.attack();


        // Abstract Factory
        System.out.println("\n=== Abstract Factory ===");

        ArmyEquipmentFactory elfFactory = new ElfEquipmentFactory();

        Weapon elfWeapon = elfFactory.createWeapon();
        Armor elfArmor = elfFactory.createArmor();

        System.out.println("\nElf army equipment:");
        elfWeapon.use();
        elfArmor.protect();

        ArmyEquipmentFactory knightFactory = new KnightEquipmentFactory();

        Weapon knightWeapon = knightFactory.createWeapon();
        Armor knightArmor = knightFactory.createArmor();

        System.out.println("\nKnight army equipment:");
        knightWeapon.use();
        knightArmor.protect();
    }
}