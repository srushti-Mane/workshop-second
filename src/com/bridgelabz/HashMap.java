package com.bridgelabz;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class HashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> HashMap = new LinkedHashMap<Integer, String>();
           /*
           for adding elements
            */
        HashMap.put(1, "Srushti");
        HashMap.put(2, "Poonam");
        HashMap.put(3, "Pallavi");
        System.out.println("before adding :" + HashMap);
        HashMap.put(1, "Pragati");
        System.out.println("after adding :" + HashMap);
        /*
        for removing elements
         */
        System.out.println("before removing :" + HashMap);
        HashMap.remove(2);
        System.out.println("after removing :" + HashMap);

    }
}
