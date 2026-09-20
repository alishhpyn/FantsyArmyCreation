public abstract class Unit {
    private String name;
    private int health;
    private int damage;

    public Unit( String name,int health,int damage){
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
