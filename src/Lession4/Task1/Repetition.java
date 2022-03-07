package Lession4.Task1;

import java.util.*;

public class Repetition {
    public static List<String> arrayList = new ArrayList<>(20);

    public static void main(String[] args) {

        arrayList.add("Go");
        arrayList.add("Put");
        arrayList.add("Home");
        arrayList.add("Head");
        arrayList.add("Burn");
        arrayList.add("Task");
        arrayList.add("Head");
        arrayList.add("Human");
        arrayList.add("Girl");
        arrayList.add("Man");
        arrayList.add("Toys");
        arrayList.add("Burn");
        arrayList.add("Gift");
        arrayList.add("Keyboard");
        arrayList.add("Head");

        System.out.println("Размер листа = " + arrayList.size());

        HashSet<String> exclusive = new HashSet<>(arrayList);

        System.out.println("Размер set = " + exclusive.size());

        HashMap<String, Integer> result = new HashMap<>();
        for (String str : exclusive) {
            result.put(str, count(str));
        }
        System.out.println(result);


    }

    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : arrayList){
            if(strThis.equals(str)) result++;
        }
        return result;
    }

}
