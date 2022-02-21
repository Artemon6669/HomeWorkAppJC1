package Lession1;
import java.util.Arrays;

public class Team {
    private String teamName;
    Player[] players;



    public Team (String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void showResults() {
        System.out.println(Arrays.toString(players));
    }

    @Override
    public String toString() {
        return teamName + players;
    }
}

