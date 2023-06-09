package io.codelex.collections.practice.flightApp;

import io.codelex.collections.practice.Histogram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);
        flights.forEach(System.out::println);

        List<List<String>> flightList = flights.stream().map(flight -> Arrays.stream(flight.split(" -> ")).toList()).toList();

        List<String> uniqueCities = flightList.stream().flatMap(Collection::stream).distinct().toList();
        System.out.println("All cities: " + uniqueCities + " " + uniqueCities.size());


        Map<String, List<String>> routes = new HashMap<>();

        for (int i = 0; i < flightList.size(); i++) {
            List<String> d = routes.getOrDefault(flightList.get(i).get(0), new ArrayList<>());
            d.add(flightList.get(i).get(1));
            routes.put(flightList.get(i).get(0), d);
        }
        System.out.println(routes);

        Graph flightNetwork = new Graph(false,  true);
        for(String city: uniqueCities){
            flightNetwork.addVertex(city);
        }


        for(Map.Entry<String, List<String>> route: routes.entrySet()){
            for(String destination: route.getValue()){
                flightNetwork.addEdge(flightNetwork.getVertexByValue(route.getKey()),flightNetwork.getVertexByValue(destination), null);
            }
        }

        flightNetwork.print();







//        System.out.println(flightNetwork.getVertices().size());
//        flightNetwork.getVertices().stream().distinct().forEach(v -> System.out.println(v.getData()));
//        flightNetwork.print();

    }
}
