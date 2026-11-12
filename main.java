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
		Item fireSword = new Item("Fire Sword", 20, true);
		Item iceSword = new Item("Ice Sword", 20, true);
		Item guardianShield = new Item("Guardian Shield", 10, false);

		Player player1 = new Player("Elara the Enchanter", 10, 4);
		player1.addItem(guardianShield);
	}
}
