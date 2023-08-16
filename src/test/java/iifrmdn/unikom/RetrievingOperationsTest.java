package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingOperationsTest {

    @Test
    void testLimit() {
        List.of("Abdul","Asep","Dadang","Diding","Dudung","Tatang").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Abdul","Asep","Dadang","Diding","Dudung","Tatang").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Aan","Abdi","Asep","Dadang","Diding","Dudung","Tatang","Zed").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Aan","Abdi","Asep","Dadang","Diding","Dudung","Tatang","Zed").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Aan","Abdi","Asep","Dadang","Diding","Dudung","Tatang","Zed").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });

    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Aan","Abdi","Asep","Dadang","Diding","Dudung","Tatang","Zed").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

}
