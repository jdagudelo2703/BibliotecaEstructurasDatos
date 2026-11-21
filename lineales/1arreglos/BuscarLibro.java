import java.util.Arrays;

public class BuscarLibro {
    public static void main(String[] args) {
        String[] titulos = {"Cien años de soledad", "El principito", "La vorágine"};
        String buscado = "El principito";
        int posicion = Arrays.asList(titulos).indexOf(buscado);

        if (posicion >= 0) {
            System.out.println("Libro encontrado en la posición " + posicion);
        } else {
            System.out.println("El libro no aparece en el catálogo.");
        }
    }
}
