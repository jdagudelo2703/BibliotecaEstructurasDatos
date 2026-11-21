import java.util.ArrayDeque;
import java.util.Queue;

public class ColaSolicitudes {
    public static void main(String[] args) {
        Queue<String> solicitudes = new ArrayDeque<>();
        solicitudes.offer("Préstamo - Ana");
        solicitudes.offer("Devolución - Luis");
        solicitudes.offer("Préstamo - Sara");

        while (!solicitudes.isEmpty()) {
            System.out.println("Atendiendo: " + solicitudes.poll());
        }
    }
}
