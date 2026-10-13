
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimesGenerator implements Iterable<Integer> {
    private int n;

    public PrimesGenerator(int n) {
        this.n = n;
    }

    // Проверяем, является ли число простым
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Создаем итератор для перебора чисел
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int number = 2;
            private int count = 0;

            public boolean hasNext() {
                return count < n;
            }

            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                while (!isPrime(number)) {
                    number++;
                }

                int prime = number;
                number++;
                count++;

                return prime;
            }
        };
    }
}