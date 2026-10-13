import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String text = "Java is easy. Java is useful. "
                + "I like Java, and I like programming.";

        // Переводим текст в нижний регистр
        text = text.toLowerCase();

        // Разделяем текст на слова
        String[] words = text.split("[^a-z]+");

        // Создаем карту для подсчета слов
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                int count = wordCount.getOrDefault(word, 0);
                wordCount.put(word, count + 1);
            }
        }

        System.out.println("Частота слов:");

        for (Map.Entry<String, Integer> entry
                : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + entry.getValue());
        }
    }
}