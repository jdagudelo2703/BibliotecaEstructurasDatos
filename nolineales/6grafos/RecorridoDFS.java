import java.util.*;

public class RecorridoDFS {
    static void recorrer(String sede, Map<String, List<String>> red, Set<String> visitadas) {
        if (!visitadas.add(sede)) return;
        System.out.println("Sede alcanzable: " + sede);
        for (String vecina : red.getOrDefault(sede, Collections.emptyList())) {
            recorrer(vecina, red, visitadas);
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> red = new LinkedHashMap<>();
        red.put("Centro", Arrays.asList("Norte", "Sur"));
        red.put("Norte", Arrays.asList("Centro", "Universidad"));
        red.put("Sur", Arrays.asList("Centro"));
        red.put("Universidad", Arrays.asList("Norte"));
        recorrer("Centro", red, new HashSet<>());
    }
}
