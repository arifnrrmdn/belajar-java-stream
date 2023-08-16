package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("iifrmdn");
        builder.add("10522014").add("unikom");

        Stream<String> information = builder.build();
        information.forEach(System.out::println);

    }

    @Test
    void testStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("iifrmdn").add("10522014").add("unikom").build();

        stream.forEach(System.out::println);
    }

}
