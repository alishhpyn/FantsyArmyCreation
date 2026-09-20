public abstract class Unit {
    private String name;
    private int health;
    private int damage;


    public Unit(String name, int health, int damage) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty."
            );
        }

        if (health <= 0 || damage < 0) {
            throw new IllegalArgumentException(
                    "Health must be positive and damage cannot be negative."
            );
        }

        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attack();

}
