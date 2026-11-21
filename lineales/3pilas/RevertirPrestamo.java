import java.util.Stack;

public class RevertirPrestamo {
    public static void main(String[] args) {
        Stack<String> acciones = new Stack<>();
        acciones.push("Registrar préstamo del libro 101");
        acciones.push("Registrar devolución del libro 205");
        System.out.println("Se revierte la acción más reciente: " + acciones.pop());
        System.out.println("Acciones restantes: " + acciones);
    }
}
