import java.util.*;

public class Task5 {

    // Меняем местами ключи и значения
    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Иван");
        students.put(2, "Анна");
        students.put(3, "Олег");

        System.out.println("Исходная карта:");
        System.out.println(students);

        Map<String, Integer> result = reverseMap(students);

        System.out.println("После обмена:");
        System.out.println(result);
    }
}