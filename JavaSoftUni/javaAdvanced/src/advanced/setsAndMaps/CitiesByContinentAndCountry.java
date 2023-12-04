package advanced.setsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, ArrayList<String>>> continentMap = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!continentMap.containsKey(continent)) {
                continentMap.put(continent, new LinkedHashMap<>());
            }

            if (!continentMap.get(continent).containsKey(country)) {
                continentMap.get(continent).put(country, new ArrayList<>());
            }
            continentMap.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, ArrayList<String>>> continentEntry : continentMap.entrySet()) {
            System.out.println(continentEntry.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> countryEntry : continentEntry.getValue().entrySet()) {
                System.out.println("  " + countryEntry.getKey() + " -> " + String.join(", ", countryEntry.getValue()));
            }
        }
    }

}
