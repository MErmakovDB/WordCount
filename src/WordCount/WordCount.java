package WordCount;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class WordCount {

    @SneakyThrows
    public static long count(String file){
        return Files.lines(Paths.get(file))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .count();
    }
    @SneakyThrows
    public static void main(String[] args){
        System.out.println(count("src\\WordCount\\text.txt"));
    }
}
