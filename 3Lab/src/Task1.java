import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int N = 15;
        Random random = new Random();

        // а) Создаем массив случайных чисел от 0 до 100
        Integer[] array = new Integer[N];

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(101);
        }

        System.out.println("а) Массив:");
        System.out.println(Arrays.toString(array));

        // б) Создаем список из массива
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("б) Список:");
        System.out.println(list);

        // в) Сортируем по возрастанию
        Collections.sort(list);

        System.out.println("в) По возрастанию:");
        System.out.println(list);

        // г) Сортируем по убыванию
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("г) По убыванию:");
        System.out.println(list);

        // д) Перемешиваем элементы
        Collections.shuffle(list);

        System.out.println("д) Перемешанный список:");
        System.out.println(list);

        // е) Циклический сдвиг на один элемент
        Collections.rotate(list, 1);

        System.out.println("е) После сдвига:");
        System.out.println(list);

        // ж) Оставляем только уникальные значения
        Set<Integer> unique = new LinkedHashSet<>(list);

        System.out.println("ж) Уникальные значения:");
        System.out.println(unique);

        // з) Находим значения, которые повторяются
        Map<Integer, Integer> count = new HashMap<>();

        for (int number : list) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int number : list) {
            if (count.get(number) > 1) {
                duplicates.add(number);
            }
        }

        System.out.println("з) Повторяющиеся значения:");
        System.out.println(duplicates);

        // и) Преобразуем список обратно в массив
        Integer[] resultArray = list.toArray(new Integer[0]);

        System.out.println("и) Массив из списка:");
        System.out.println(Arrays.toString(resultArray));

        // к) Считаем количество каждого числа
        Map<Integer, Integer> frequency = new TreeMap<>();

        for (int number : resultArray) {
            frequency.put(number,
                    frequency.getOrDefault(number, 0) + 1);
        }

        System.out.println("к) Частота чисел:");

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + entry.getValue() + " раз(а)");
        }
    }
}

