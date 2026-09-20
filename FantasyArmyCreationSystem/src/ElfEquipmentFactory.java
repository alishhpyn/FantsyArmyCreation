public class ElfEquipmentFactory implements ArmyEquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LightArmor();
    }
}
