import java.util.HashMap;
import java.util.Map;

public class ContarPrestamos {
    public static void main(String[] args) {
        Map<String, Integer> prestamos = new HashMap<>();
        String[] codigos = {"L-01", "L-02", "L-01", "L-03", "L-02", "L-01"};
        for (String codigo : codigos) prestamos.put(codigo, prestamos.getOrDefault(codigo, 0) + 1);
        System.out.println("Cantidad de préstamos por código: " + prestamos);
    }
}
