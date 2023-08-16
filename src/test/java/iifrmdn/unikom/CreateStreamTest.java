package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {


    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("iifrmdn");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });

    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("iifrmdn","unikom","10522014");
        arrayStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
//        integerStream.forEach(data -> {
//            System.out.println(data);
//        });
        integerStream.forEach(System.out::println);

        String[] dataArray = new String[]{
                "pisang", "wortel", "alpukat"
        };
        Stream<String> streamFromArray = Arrays.stream(dataArray);
//        streamFromArray.forEach(data -> {
//            System.out.println(data);
//        });
        streamFromArray.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> stringCollection = List.of("iifrmdn","unikom","bdg");

        Stream<String> dataMahasiswa = stringCollection.stream();
        dataMahasiswa.forEach(System.out::println);

        Stream<String> dataMahasiswa2 = stringCollection.stream();
        dataMahasiswa2.forEach(System.out::println);

    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> generateStreamInfinte = Stream.generate(() -> "hello iifrmdn");
        //generateStreamInfinte.forEach(System.out::println);

        Stream<Integer> iterateStreamInfinite = Stream.iterate(1, value -> value + 1);
        //iterateStreamInfinite.forEach(System.out::println);

    }

}
