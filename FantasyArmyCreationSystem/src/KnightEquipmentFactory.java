public class KnightEquipmentFactory implements ArmyEquipmentFactory{
    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
