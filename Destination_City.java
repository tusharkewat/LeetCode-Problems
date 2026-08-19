// LeetCode 1436. Destination City

import java.util.HashSet;
import java.util.List;

public class Destination_City {
    public String destCity(List<List<String>> paths) {

        HashSet<String> sources = new HashSet<>();

        for (List<String> path : paths) {
            sources.add(path.get(0));
        }

        for (List<String> path : paths) {

            String destination = path.get(1);

            if (!sources.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}
