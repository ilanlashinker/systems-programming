// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package part1_OOP;

public class Enemy extends Character {
	private int damage;

	public Enemy(String name, int health, int level, int damage) {
		super(name, health, level);

		if (damage < 1) {
			this.damage = 1;
		} else if (damage > 5) {
			this.damage = 5;
		} else {
			this.damage = damage;
		}
	}

	public int getDamage() {
		return damage;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Damage: " + damage;
	}
}