// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

public class GameWorld {
    private String name;
    private Player[] players;
    private int playersCounter = 0;
    private Enemy[] enemies;
    private int enemiesCounter = 0;
    private int difficulty;

    public GameWorld() {
        this.name = "Crystalpath";
        this.players = new Player[0];
        this.enemies = new Enemy[0];
        this.difficulty = 1;
    }

    public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty) {
        this.name = name;
        if (difficulty > 3 || difficulty < 1) {
            throw new IllegalArgumentException("Invalid input");
        } else {
            this.difficulty = difficulty;
        }
        int plNull = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                plNull++;
            }
        }
        this.players = new Player[players.length - plNull];
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                this.players[playersCounter] = players[i];
                playersCounter++;
            }
        }

        int enNull = 0;
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i] == null) {
                enNull++;
            }
        }
        this.enemies = new Enemy[enemies.length - enNull];
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i] != null) {
                this.enemies[enemiesCounter] = enemies[i];
                enemiesCounter++;
            }
        }

    }

    public void addPlayer(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("You cannot add null player!");
        }
        if (playersCounter >= players.length) {
            Player[] upPlayers = new Player[players.length + 1];
            for (int i = 0; i < players.length; i++) {
                upPlayers[i] = players[i];
            }
            players = upPlayers;
        }
        players[playersCounter] = player;
        playersCounter++;
    }

    public void printAllPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("------------- " + "Player " + (i + 1) + " -------------");
            System.out.println(players[i].toString() + '\n');
        }
    }

    public int getTotalValueOfWorld() {
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            sum += players[i].calculateInventoryValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "World Name: " + this.name + '\n' + "Difficulty: " + this.difficulty + '\n' + "Number of players: "
                + this.players.length;

    }
}
