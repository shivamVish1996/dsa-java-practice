package java8.streams.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        IntStream intStream1 = IntStream.range(1, 10000);

        // Supplier<Stream<Integer>> intStreamSupplier = () -> Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long startTime = System.currentTimeMillis();
        intStream1.filter(i -> i % 2 == 0);

        long endTime = System.currentTimeMillis();

        System.out.println("for simple stream: " + (endTime - startTime));
        System.out.println();

        IntStream intStream2 = IntStream.range(1, 10000);

        startTime = System.currentTimeMillis();
        intStream2.parallel()
                .filter(i -> i % 2 == 0);

        endTime = System.currentTimeMillis();
        System.out.println("for parallel stream: " + (endTime - startTime));
    }
}
