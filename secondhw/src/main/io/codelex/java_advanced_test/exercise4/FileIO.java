package io.codelex.java_advanced_test.exercise4;

import java.io.*;

public class FileIO {

    private static final String file = "src/main/resources/";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(file + "text.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(file + "txet.txt"));
        String line;
        String reversed;
        while ((line = in.readLine()) != null) {
            reversed = new StringBuilder(line).reverse().toString();
            out.write(reversed);
        }
        in.close();
        out.close();
    }
}
