package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        TreeMap<Integer, Integer> scoreCount = new TreeMap<>();
        for (String score : scores.split(" ")) {
            int count = scoreCount.getOrDefault(Integer.parseInt(score), 0);
            scoreCount.put(Integer.parseInt(score), count + 1);
        }

        for (int start = 0, end = 9; start <= 100; start += 10, end += 10) {

            int scoresInRange = scoreCount.subMap(start, true, end, true).values().stream().reduce(0, Integer::sum);
            if (start == 100) {
                System.out.println(start + ": " + "*".repeat(scoresInRange));
            } else {
                System.out.println(start + "-" + end + ": " + "*".repeat(scoresInRange));
            }
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
