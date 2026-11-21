import java.util.Arrays;

public class OrdenarTitulos {
    public static void main(String[] args) {
        String[] titulos = {"La vorágine", "El principito", "Cien años de soledad"};
        Arrays.sort(titulos);
        System.out.println("Catálogo ordenado por título:");
        for (String titulo : titulos) System.out.println("- " + titulo);
    }
}
