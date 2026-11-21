import java.util.*;

public class ConexionesSedes {
    public static void main(String[] args) {
        Map<String, List<String>> conexiones = new LinkedHashMap<>();
        conexiones.put("Centro", Arrays.asList("Norte", "Sur"));
        conexiones.put("Norte", Arrays.asList("Centro", "Universidad"));
        conexiones.put("Sur", Arrays.asList("Centro"));
        conexiones.put("Universidad", Arrays.asList("Norte"));

        String sede = "Centro";
        System.out.println("Sedes conectadas con " + sede + ": " + conexiones.get(sede));
    }
}
