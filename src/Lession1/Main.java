package Lession1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Course c = new Course(50, 0); // Создаем полосу препятствий
        Player[] team1 = new Player[]{
                new Player("Bobby", 100, 1),
                new Player("John", 90, 0),
                new Player("Jack", 95, 2)};
        Team team = new Team("Red", team1);
        c.doIt(team);
        team.showResults();


    }
}
