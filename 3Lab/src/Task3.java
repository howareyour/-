import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();

        people.add(new Human("Иван", "Петров", 20));
        people.add(new Human("Анна", "Сидорова", 19));
        people.add(new Human("Олег", "Иванов", 21));
        people.add(new Human("Мария", "Петрова", 18));
        people.add(new Human("Алексей", "Иванов", 20));
        people.add(new Human("Иван", "Петров", 20));

        // а) HashSet
        Set<Human> set1 = new HashSet<>(people);

        System.out.println("а) HashSet:");
        System.out.println(set1);

        // б) LinkedHashSet
        Set<Human> set2 = new LinkedHashSet<>(people);

        System.out.println("\nб) LinkedHashSet:");
        System.out.println(set2);

        // в) TreeSet с естественной сортировкой
        Set<Human> set3 = new TreeSet<>(people);

        System.out.println("\nв) TreeSet:");
        System.out.println(set3);

        // г) TreeSet с сортировкой по фамилии
        Set<Human> set4 =
                new TreeSet<>(new HumanComparatorByLastName());

        set4.addAll(people);

        System.out.println("\nг) TreeSet по фамилии:");
        System.out.println(set4);

        // д) TreeSet с анонимным компаратором по возрасту
        Set<Human> set5 = new TreeSet<>(
                new Comparator<Human>() {
                    public int compare(Human h1, Human h2) {
                        return Integer.compare(
                                h1.getAge(), h2.getAge());
                    }
                }
        );

        set5.addAll(people);

        System.out.println("\nд) TreeSet по возрасту:");
        System.out.println(set5);

        /*
         * е) Объяснение различий:
         *
         * HashSet не гарантирует порядок элементов.
         * LinkedHashSet сохраняет порядок добавления.
         * TreeSet сортирует элементы.
         * Comparable задает основной порядок сортировки.
         * Comparator позволяет задать другое правило.
         *
         * Если компаратор возвращает 0, TreeSet считает,
         * что элементы одинаковы для данного порядка.
         * Поэтому при сравнении только по фамилии или возрасту
         * некоторые люди не попадут в множество.
         *
         * HashSet и LinkedHashSet сохраняют оба одинаковых
         * объекта из списка, потому что equals и hashCode
         * отдельно не переопределены.
         */
    }
}