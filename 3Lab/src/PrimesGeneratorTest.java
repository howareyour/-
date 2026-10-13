import java.util.*;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int N = 10;

        PrimesGenerator generator = new PrimesGenerator(N);
        List<Integer> primes = new ArrayList<>();

        // Выводим числа в прямом порядке
        Iterator<Integer> iterator = generator.iterator();

        System.out.println("Прямой порядок:");

        while (iterator.hasNext()) {
            int prime = iterator.next();
            primes.add(prime);
            System.out.print(prime + " ");
        }

        // Выводим те же числа в обратном порядке
        System.out.println("\nОбратный порядок:");

        ListIterator<Integer> reverse =
                primes.listIterator(primes.size());

        while (reverse.hasPrevious()) {
            System.out.print(reverse.previous() + " ");
        }

        System.out.println();
    }
}