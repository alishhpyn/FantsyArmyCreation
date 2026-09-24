public abstract class AbstractUnit implements IUnit {

    private final String name;
    private final int health;
    private final int damage;

    public AbstractUnit(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}