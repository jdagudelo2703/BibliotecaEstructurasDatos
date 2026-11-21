import java.util.LinkedList;

public class EliminarLibro {
    public static void main(String[] args) {
        LinkedList<String> catalogo = new LinkedList<>();
        catalogo.add("El principito");
        catalogo.add("La vorágine");
        String tituloAEliminar = "El principito";
        if (catalogo.remove(tituloAEliminar)) {
            System.out.println("Libro retirado del catálogo: " + tituloAEliminar);
        } else {
            System.out.println("No se encontró el título.");
        }
        System.out.println("Catálogo actual: " + catalogo);
    }
}
