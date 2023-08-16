package iifrmdn.unikom;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipelaneTest {


    @Test
    void testCreateStreamPipeline(){
        List<String> names = List.of("Hary","Adit","Aslam");

        names.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Pak " + upper)
                .forEach(System.out::println);


    }
}
