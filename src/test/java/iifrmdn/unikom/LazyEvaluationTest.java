package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermedieteOperation() {

        List<String> names = List.of("Hary","Rafli","Chandra");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " toUPPERCASE");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOPeration() {
        List<String> names = List.of("Hary","Rafly","Chandra");
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " toUPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr." + upper;
                })
                .forEach(mr -> {
                    System.out.println(mr);
                });
    }

}
