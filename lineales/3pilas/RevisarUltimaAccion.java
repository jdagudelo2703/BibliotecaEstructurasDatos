import java.util.Stack;

public class RevisarUltimaAccion {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        historial.push("Buscar libro");
        historial.push("Registrar usuario");
        if (!historial.empty()) {
            System.out.println("Última acción: " + historial.peek());
        } else {
            System.out.println("No hay acciones registradas.");
        }
    }
}
