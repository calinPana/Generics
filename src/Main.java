import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4.5, 10, 1.33, 5L));
        System.out.println(addNumbers(numbers));
        Short n = 5;
        System.out.println(xPowerOfY(5, 100));
//        Map<String, List<String>> phonebook = new HashMap<>();
//
//        List<String> phoneNumbers = new ArrayList<>();
//
//        phoneNumbers.add("0987654321");
//        phoneNumbers.add("1234567890");
//        phoneNumbers.add("1230984567");
//
//        phonebook.put("Vasile", phoneNumbers);
//
//        phonebook.put("Gheorghe", new ArrayList<>());
//
//        phonebook.get("Gheorghe").add("0732871486");
//
//        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
//            //System.out.println(entry);
//            for (String phone : entry.getValue()) {
//
//                if (phone.equals("0987654321")) {
//                    System.out.println(entry.getKey());
//                }
//            }
//
//        }

    }

    public static <T extends Number> Number addNumbers(List<T> numberList) {
        Number sum = 0;
        //long sum =0;
        for (T number : numberList) {
            sum = sum.doubleValue() + number.doubleValue();
        }
        return sum;
    }

    public static <T extends Number> Number xPowerOfY(T x, Integer y) {
        if (x instanceof Integer) {
            System.out.println("Integer:");
            return Math.pow(x.intValue(), y);
        } else if (x instanceof Long) {
            System.out.println("Long:");
            return Math.pow(x.longValue(), y);
        } else if (x instanceof Double) {
            System.out.println("Double:");
            return Math.pow(x.doubleValue(), y);
        }
        System.out.println("Float or something else:");
        return Math.pow(x.floatValue(), y);
    }

    public static <T> void printTable (Map<String, List<T>> table) {
        for (T key : table.keySet()) {
            System.out.print(key);
        }
    }

}
