import java.util.ArrayDeque;
import java.util.Queue;

public class TurnosAtencion {
    public static void main(String[] args) {
        Queue<String> turnos = new ArrayDeque<>();
        turnos.offer("Turno 1: Camila");
        turnos.offer("Turno 2: Mateo");
        turnos.offer("Turno 3: Julia");
        while (!turnos.isEmpty()) System.out.println("Atendiendo " + turnos.poll());
    }
}
