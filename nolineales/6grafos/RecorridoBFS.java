import java.util.*;

public class RecorridoBFS {
    public static void main(String[] args) {
        Map<String, List<String>> red = new LinkedHashMap<>();
        red.put("Centro", Arrays.asList("Norte", "Sur"));
        red.put("Norte", Arrays.asList("Centro", "Universidad"));
        red.put("Sur", Arrays.asList("Centro"));
        red.put("Universidad", Arrays.asList("Norte"));
        Queue<String> pendientes = new ArrayDeque<>();
        Set<String> visitadas = new LinkedHashSet<>();
        pendientes.offer("Centro");
        visitadas.add("Centro");
        while (!pendientes.isEmpty()) {
            String sede = pendientes.poll();
            System.out.println("Visitando: " + sede);
            for (String vecina : red.getOrDefault(sede, Collections.emptyList())) {
                if (visitadas.add(vecina)) pendientes.offer(vecina);
            }
        }
    }
}
