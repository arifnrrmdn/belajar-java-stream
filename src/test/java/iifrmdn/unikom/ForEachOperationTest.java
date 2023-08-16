package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("Arif","Rama","Wijaya").stream()
                .map(name -> {
                    System.out.println("Before Chane to upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Arif", "Rama", "Wijaya").stream()
                .peek(name -> System.out.println("Before change to Upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("After change to upper : " + upper))
                .forEach(name -> System.out.println("Final name : " + name));
    }

}
