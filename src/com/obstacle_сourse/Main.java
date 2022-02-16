package com.obstacle_сourse;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //Course c = new Course(20); // Создаем полосу препятствий
        Team team1 = new Team(); // Создаем команду
        //c.doIt(team); // Просим команду пройти полосу
        //team.showResults(); // Показываем результаты
        Player[] team1 = new Player[]{
                new Player("Bobby", 100, 1),
                new Player("John", 90, 0),
                new Player("Jack", 95, 2)};
    }
}
