import java.util.LinkedList;

public class RecorrerCatalogo {
    public static void main(String[] args) {
        LinkedList<String> libros = new LinkedList<>();
        libros.add("Cien años de soledad");
        libros.add("El principito");
        libros.add("La vorágine");
        int numero = 1;
        for (String libro : libros) System.out.println((numero++) + ". " + libro);
    }
}
