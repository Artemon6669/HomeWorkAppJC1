package Lession4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("12345", "Vasya");
        phoneBook.add("987456","Petya");
        phoneBook.add("321","Petr");
        phoneBook.add("11111", "Vasya");
        phoneBook.add("123456","Petr");
        System.out.println(phoneBook.stringStringHashMap.toString());

        System.out.println(phoneBook.getPhone("Petya"));
        System.out.println(phoneBook.getPhone("Vasya"));
        System.out.println(phoneBook.getPhone("Petr"));
        System.out.println(phoneBook.getPhone("123"));
    }
}
