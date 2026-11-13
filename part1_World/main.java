// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package part1_World;

public class main {
	public static void simulateBattle(Player player, Enemy enemy) {
		System.out.println(
				player.getName() + " level : " + player.getLevel() + " VS " + enemy.getName() + " level : " + enemy.getLevel());
		if (player.getLevel() > enemy.getLevel()) {
			player.levelUp();
			System.out.println(player.getName() + " wins!");
		} else if (player.getLevel() < enemy.getLevel()) {
			enemy.levelUp();
			System.out.println(enemy.getName() + " wins!");
		} else {
			System.out.println("The battle ended in a draw.");
		}
	}

	public static void main(String[] args) {
		Item firstAidKit = new Item("First Aid Kit", 15, false);
		Item crowbar = new Item("Crowbar", 10, false);
		Item bodyArmor = new Item("Body Armor", 20, false);
		Item heavyPistol = new Item("Heavy Pistol", 25, false);
		Item automaticRifle = new Item("Automatic Rifle", 30, false);
		Item shotgun = new Item("Shotgun", 35, false);

		Player lucia = new Player("Lucia", 10, 4);
		lucia.addItem(automaticRifle);
		lucia.addItem(heavyPistol);
		lucia.addItem(bodyArmor);
		lucia.addItem(firstAidKit);

		Player jason = new Player("Jason", 10, 2);
		jason.addItem(shotgun);
		jason.addItem(crowbar);
		jason.addItem(firstAidKit);
		jason.addItem(heavyPistol);
		jason.addItem(bodyArmor);

		Enemy mendez = new Enemy("Detective Mendez", 10, 2, 3);
		Player[] playersList = new Player[] { lucia, jason };
		Enemy[] enemiesList = new Enemy[] { mendez };

		GameWorld world = new GameWorld("Leonida", playersList, enemiesList, 1);
		world.printAllPlayers();

		System.out.println(lucia.getName() + " total inventory value: " + lucia.calculateInventoryValue());
		System.out.println(jason.getName() + " total inventory value: " + jason.calculateInventoryValue());

		simulateBattle(lucia, mendez);

	}
}
