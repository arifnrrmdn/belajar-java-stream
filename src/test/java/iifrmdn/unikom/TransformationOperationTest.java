package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {

        List.of("Chandra","Hary","Rafly").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));

    }

    @Test
    void testFlatMap() {

        List.of("Chandra","Rafly","Hary").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length())) //menampilkan toupper dan panjang
                .flatMap(value -> Stream.of(value,value,value)) // akan diulang 3x
                .forEach(tampilkan -> System.out.println(tampilkan)); // menampilkan data
        }
    }

