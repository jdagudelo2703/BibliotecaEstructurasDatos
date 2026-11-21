import java.util.LinkedList;

public class CatalogoDinamico {
    public static void main(String[] args) {
        LinkedList<String> catalogo = new LinkedList<>();
        catalogo.add("La casa de los espíritus");
        catalogo.add("El principito");
        catalogo.addFirst("Don Quijote de la Mancha");
        catalogo.remove("El principito");

        System.out.println("Libros disponibles:");
        for (String titulo : catalogo) {
            System.out.println("- " + titulo);
        }
    }
}
