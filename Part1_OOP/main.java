// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

public class main {
	public static void simulateBattle(Player player, Enemy enemy) {
		System.out.println(
				player.getName() + " level: " + player.getLevel() + " vs " + enemy.getName() + " level: " + enemy.getLevel());
		if (player.getLevel() > enemy.getLevel()) {
			player.levelUp();
			System.out.println(player.getName() + " won the battle.");
		} else if (player.getLevel() < enemy.getLevel()) {
			enemy.levelUp();
			System.out.println(enemy.getName() + " won the battle.");
		} else {
			System.out.println("The battle ended in a draw.");
		}
	}

	public static void main(String[] args) {
		Item spellBook = new Item("Spell Book", 25, true);
		Item iceSword = new Item("Ice Sword", 20, true);
		Item guardianShield = new Item("Guardian Shield", 15, false);
		Item ironHelmet = new Item("Iron Helmet", 10, false);
		Item magicArmor = new Item("Magic Armor", 30, true);

		Player player1 = new Player("Elara the Enchanter", 10, 4);
		player1.addItem(spellBook);
		player1.addItem(magicArmor);

		Player player2 = new Player("Thorin the Brave", 15, 2);
		player2.addItem(iceSword);
		player2.addItem(guardianShield);
		player2.addItem(ironHelmet);

		Enemy goblin = new Enemy("Goblin", 10, 2, 3);
		Player[] playersList = new Player[] { player1, player2 };
		Enemy[] enemiesList = new Enemy[] { goblin };

		GameWorld world = new GameWorld("Crystalpath", playersList, enemiesList, 2);
		world.printAllPlayers();

		System.out.println(player1.getName() + " total inventory value: " + player1.calculateInventoryValue());
		System.out.println(player2.getName() + " total inventory value: " + player2.calculateInventoryValue());

		simulateBattle(player1, goblin);

	}
}
