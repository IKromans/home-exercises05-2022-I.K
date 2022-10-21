package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/main/resources/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> allFlights = Files.readAllLines(path, charset);

        Scanner input = new Scanner(System.in);
        Map<String, List<String>> cityDestinations = new HashMap<>();
        List<String> visitedCities = new ArrayList<>();

        for (int i = 0; i < allFlights.size(); i++) {
            String[] splitFlight = allFlights.get(i).split("->");
            if (cityDestinations.containsKey(splitFlight[0].trim())) {
                cityDestinations.get(splitFlight[0].trim()).add(splitFlight[1].trim());
            } else {
                cityDestinations.put(splitFlight[0].trim(), new ArrayList<>(Collections.singleton(splitFlight[1].trim())));
            }
        }

        int count = 0;
        while (true) {
            System.out.print("\nWhat would you like to do:\nTo display list of the cities press 1\nTo exit program press #\n> ");
            String n = input.nextLine();
            switch (n) {
                case "1":
                    System.out.println(allFlights);
                    System.out.println("To select a city from which you would like to start press 1");
                    System.out.print("> ");
                    if (input.nextLine().equals("1")) {
                        System.out.println(cityDestinations.keySet());
                        System.out.print("Enter the city you would like to start journey from:\n> ");
                        visitedCities.add(input.nextLine());
                        System.out.println("Your starting city is : " + visitedCities.get(count));
                        System.out.print("Enter your next destination city, you can choose from :");
                        System.out.print(cityDestinations.get(visitedCities.get(count)) + "\n> ");

                        boolean comeHome = false;
                        while (!comeHome) {
                            visitedCities.add(input.nextLine());
                            count++;
                            System.out.println("You're in " + visitedCities.get(count));
                            if (visitedCities.get(visitedCities.size() - 1).equals(visitedCities.get(0))) {
                                comeHome = true;
                            } else {
                                System.out.print("Enter your next stop, you can choose from :");
                                System.out.print(cityDestinations.get(visitedCities.get(count)) + "\n> ");
                            }
                        }
                    } else {
                        continue;
                    }
                    System.out.println("Welcome back!");
                    System.out.println("Your trip was : " + visitedCities);
                    break;
                case "#":
                    System.exit(0);
            }
        }
    }
}
