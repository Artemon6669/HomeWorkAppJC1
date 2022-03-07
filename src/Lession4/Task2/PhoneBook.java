package Lession4.Task2;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String name){
        stringStringHashMap.put(phone, name);
    }

    public String getPhone(String name){
        if(stringStringHashMap.containsValue(name)){
            String result = "Номера телефонов " + name + ": ";
            for (String key : stringStringHashMap.keySet()) {
                if (stringStringHashMap.get(key).equals(name)) result += key + "; ";
            }
            return result;
        } else return "Не найдено";
    }
}
