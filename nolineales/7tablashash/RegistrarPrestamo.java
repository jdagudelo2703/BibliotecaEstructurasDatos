import java.util.HashMap;
import java.util.Map;

public class RegistrarPrestamo {
    public static void main(String[] args) {
        Map<String, Integer> prestamosPorIsbn = new HashMap<>();
        String isbn = "978-0307474728";
        prestamosPorIsbn.put(isbn, prestamosPorIsbn.getOrDefault(isbn, 0) + 1);
        prestamosPorIsbn.put(isbn, prestamosPorIsbn.getOrDefault(isbn, 0) + 1);
        System.out.println("Préstamos registrados para " + isbn + ": " + prestamosPorIsbn.get(isbn));
    }
}
