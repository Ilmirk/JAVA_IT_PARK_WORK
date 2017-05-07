public class SuperHero {
    protected int enemies;
    protected String name;

    public SuperHero(int enemies, String name) {
        if (enemies >= 0) {
            this.enemies = enemies;
        } else {
            this.enemies = 0;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnemies() {
        return enemies;
    }
}