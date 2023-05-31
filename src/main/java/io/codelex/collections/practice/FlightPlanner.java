package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);
        System.out.println(flights);
        flights.forEach(System.out::println);

        List<String> newList = flights.stream().map(flight -> flight.replaceAll("->\\s+", "")).collect(Collectors.toList());
        System.out.println(newList);

        //Multimap<String, List<String>> routes = new ArrayListMultimap<>();

//
//        for (String flight : flights){
//            String[] flightArr = flight.split(" -> ");
//            routes.getOrDefault(routes.get(flightArr[0]), new ArrayList<>()).add(flightArr[1]);
//        }
//
//        System.out.println(routes);


    }
}
