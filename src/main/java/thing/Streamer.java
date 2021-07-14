package thing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamer {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("i am totally ok.", "it will pass.", "i owe nothing.",
                "nothing is forever.");
        List<String> list = new ArrayList<>();
        sentences.stream()
                .map(sentence -> sentence.split(" "))
                .forEach(wordsArray -> list.addAll(Arrays.asList(wordsArray)));
        System.out.println(list);

    }
}
