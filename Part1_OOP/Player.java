// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package Part1_OOP;

public class Player extends Character {
	private Item[] inventory;
	private int indexCounter = 0;

	public Player(String name, int health, int level) {
		super(name, health, level);
		inventory = new Item[0];

	}

	public Player(String name, int health, int level, Item[] inventory) {
		super(name, health, level);
		int isNull = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				isNull++;
			}
		}
		this.inventory = new Item[inventory.length - isNull];
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				this.inventory[indexCounter] = inventory[i];
				indexCounter++;
			}
		}

	}

	public void addItem(Item item) {
		if (item == null) {
			throw new IllegalArgumentException("You cannot add null item!");
		}
		if (indexCounter >= inventory.length) {
			Item[] upItems = new Item[inventory.length + 1];
			for (int i = 0; i < inventory.length; i++) {
				upItems[i] = inventory[i];
			}
			inventory = upItems;
		}
		inventory[indexCounter] = item;
		indexCounter++;
	}

	public int calculateInventoryValue() {
		int sum = 0;
		for (int i = 0; i < inventory.length; i++) {
			sum += inventory[i].getValue();
		}
		return sum;
	}

	public boolean hasMagicalItem() {
		boolean isFound = false;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i].isMagical()) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}

	@Override
	public String toString() {
		String returns = super.toString();
		String inv = "\nInventory: ";
		for (int i = 0; i < inventory.length; i++) {
			if (i == inventory.length - 1) {
				inv += inventory[i].getName();
			} else {
				inv += inventory[i].getName() + " | ";
			}
		}
		return returns + inv;
	}
}