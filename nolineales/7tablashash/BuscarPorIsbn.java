import java.util.HashMap;
import java.util.Map;

public class BuscarPorIsbn {
    public static void main(String[] args) {
        Map<String, String> libros = new HashMap<>();
        libros.put("978-0307474728", "Cien años de soledad");
        libros.put("978-0156012195", "El principito");

        String isbnBuscado = "978-0156012195";
        String titulo = libros.get(isbnBuscado);
        if (titulo != null) {
            System.out.println("Libro encontrado: " + titulo);
        } else {
            System.out.println("No hay un libro registrado con ese ISBN.");
        }
    }
}
