package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> text = Files.readAllLines(path, charset);

        int charCount = 0;
        int wordCount = 0;
        for (String word : text){
            charCount += word.split("").length;
            wordCount += word.replaceAll("\\s+", " ").split(" ").length;
        }
        System.out.println("Lines = " + text.size());
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
