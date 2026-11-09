public class Character {
    private String name;
    private int health;
    private int level;

    public Character() {
        this.name = "Unknown";
        this.health = 0;
        this.level = 0;
    }

    public Character(String name, int health, int level) {
        this.name = name;

        if (health < 0) {
            this.health = 0;
        } else if (health > 10) {
            this.health = 10;
        } else {
            this.health = health;
        }

        if (level < 0) {
            this.level = 0;
        } else if (level > 5) {
            this.level = 5;
        } else {
            this.level = level;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        if (this.level < 5) {
            this.level++;
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.health += amount;
            if (this.health > 10) {
                this.health = 10;
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Health: " + health + "\n" +
               "Level: " + level;
    }
}