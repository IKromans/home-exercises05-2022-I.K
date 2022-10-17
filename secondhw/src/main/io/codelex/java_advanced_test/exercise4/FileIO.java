package io.codelex.java_advanced_test.exercise4;

import java.io.*;

public class FileIO {

    private static final String file = "src/main/resources/";

    public static void main(String[] args) throws IOException, InterruptedException {

        try {
            BufferedReader in = new BufferedReader(new FileReader(file + "text.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter(file + "txet.txt"));
            String line;
            String reversed;
            while ((line = in.readLine()) != null) {
                System.out.println("...reading file.");
                Thread.sleep(1500);
                reversed = new StringBuilder(line).reverse().toString();
                System.out.println("Reversing characters...");
                Thread.sleep(1000);
                System.out.println("...writing to file.");
                Thread.sleep(1500);
                out.write(reversed);
            }
            in.close();
            out.close();
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            System.out.println("Cant find your file");
        }
    }
}
