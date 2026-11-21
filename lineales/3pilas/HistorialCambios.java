import java.util.Stack;

public class HistorialCambios {
    public static void main(String[] args) {
        Stack<String> acciones = new Stack<>();
        acciones.push("Agregar libro: El principito");
        acciones.push("Actualizar ubicación del libro");

        if (!acciones.empty()) {
            System.out.println("Acción deshecha: " + acciones.pop());
        }
        System.out.println("Acciones restantes: " + acciones);
    }
}
