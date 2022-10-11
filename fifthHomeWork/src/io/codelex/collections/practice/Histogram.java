package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/main/resources//collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        List<String> examScores = new ArrayList<>(Arrays.asList(scores.split(" ")));
        List<Integer> scoresArray = examScores.stream().map(Integer::parseInt).toList();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 10) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("00-09: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 20 && scoresArray.get(i) >= 10) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("10-19: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 30 && scoresArray.get(i) >= 20) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("20-29: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 40 && scoresArray.get(i) >= 30) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("30-39: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 50 && scoresArray.get(i) >= 40) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("40-49: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 60 && scoresArray.get(i) >= 50) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("50-59: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 70 && scoresArray.get(i) >= 60) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("60-69: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 80 && scoresArray.get(i) >= 70) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("70-79: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 90 && scoresArray.get(i) >= 80) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("80-89: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) < 100 && scoresArray.get(i) >= 90) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("90-99: " + printStars(list.size()));
        list.clear();

        for (int i = 0; i < scoresArray.size(); i++) {
            if (scoresArray.get(i) == 100) {
                list.add(scoresArray.get(i));
            }
        }
        System.out.println("  100: " + printStars(list.size()));
        list.clear();
    }

    private static String printStars(int n) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stars.append("*");
        }
        return stars.toString();
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
