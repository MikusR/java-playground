import java.util.*;

public class ArraysTest {
    public static void main(String[] args) {
        Map<String, Object> variables = getStringObjectMap();

        System.out.println("Ifs");

        for (Map.Entry<String, Object> entry : variables.entrySet()) {
            System.out.println(entry.getKey());
            if (entry.getValue() instanceof int[]) {
                System.out.println(Arrays.toString((int[]) entry.getValue()));
                continue;
            }
            if (entry.getValue() instanceof String[]) {
                System.out.println(Arrays.toString((String[]) entry.getValue()));
                continue;
            }
            System.out.println(entry.getValue());
        }

        System.out.println("switch");
        for (Map.Entry<String, Object> entry : variables.entrySet()) {
            System.out.println(entry.getKey());
            switch (entry.getValue().getClass().getSimpleName()) {
                case "int[]":
                    System.out.println(Arrays.toString((int[]) entry.getValue()));
                    break;
                case "String[]":
                    System.out.println(Arrays.toString((String[]) entry.getValue()));
                    break;
                default:
                    System.out.println(entry.getValue());
                    break;
            }

        }

    }

    private static Map<String, Object> getStringObjectMap() {
        Map<String, Object> variables = new HashMap<>();
        int[] integers = {1, 4, 6, 99, 2, 1, 2};
        String[] strings = {"aa", "aaa", "zzzzzz", "a"};
        ArrayList<Integer> alintegers = new ArrayList<>(Arrays.asList(1, 4, 6, 99, 2, 1, 2));
        ArrayList<String> alstrings = new ArrayList<>(Arrays.asList("aa", "aaa", "zzzzzz", "a"));
        variables.put("Integers", integers);
        variables.put("Strings", strings);
        variables.put("Array list of Integers", alintegers);
        variables.put("Array list of Strings", alstrings);
        return variables;
    }
}
