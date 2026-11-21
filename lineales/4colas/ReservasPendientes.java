import java.util.ArrayDeque;
import java.util.Queue;

public class ReservasPendientes {
    public static void main(String[] args) {
        Queue<String> reservas = new ArrayDeque<>();
        reservas.offer("Ana - El principito");
        reservas.offer("Luis - La vorágine");
        reservas.offer("Sara - Cien años de soledad");
        System.out.println("Siguiente reserva por atender: " + reservas.peek());
        System.out.println("Reservas pendientes: " + reservas.size());
    }
}
