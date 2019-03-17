package Generics;

import java.util.*;

public class Main2 {


    public static <T> void printTable(Map<String, List<T>> table) {
        for (String element : table.keySet()) {
            System.out.print(element + " ");
        }
        System.out.println();
        final int rows = table.values().iterator().next().size();
        for (int i = 0; i < rows; i++) {
            //i<table.get(table.keySet().toArray()[0]).size()
            for (String column : table.keySet()) {
                System.out.print(table.get(column).get(i) + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Map<String, List<Object>> table = new TreeMap<>();
        table.put("Name", Arrays.asList("Calinelu", "Cristisor", "Ibrahim"));
        table.put("Age", Arrays.asList(25, 55, 16));

        printTable(table);

        List<String> names = new LinkedList<>(Arrays.asList("Calinelu", "Cristisor", "Ibrahim", "Calinelu"));
        Iterator<String> it = names.listIterator();
                //names.remove("Calinelu");
            names.lastIndexOf("Calinelu");
        System.out.println(names);
    }
}

