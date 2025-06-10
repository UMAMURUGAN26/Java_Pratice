import java.util.*;

// Player class
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Comparator class
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score; // Descending score
        } else {
            return a.name.compareTo(b.name); // Ascending name
        }
    }
}

public class ComparatorChecker {
    public static void main(String[] args) {
        // Hardcoded input
        Player[] players = {
            new Player("amy", 100),
            new Player("david", 100),
            new Player("heraldo", 50),
            new Player("aakansha", 75),
            new Player("aleksa", 150)
        };

        // Sort using custom comparator
        Arrays.sort(players, new Checker());

        // Print sorted players
        for (Player p : players) {
            System.out.printf("%s %d\n", p.name, p.score);
        }
    }
}