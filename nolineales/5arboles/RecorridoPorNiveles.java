import java.util.ArrayDeque;
import java.util.Queue;

class NodoNivel {
    int codigo;
    NodoNivel izquierda, derecha;
    NodoNivel(int codigo) { this.codigo = codigo; }
}

public class RecorridoPorNiveles {
    public static void main(String[] args) {
        NodoNivel raiz = new NodoNivel(40);
        raiz.izquierda = new NodoNivel(20);
        raiz.derecha = new NodoNivel(60);
        raiz.izquierda.izquierda = new NodoNivel(10);
        Queue<NodoNivel> cola = new ArrayDeque<>();
        cola.offer(raiz);
        while (!cola.isEmpty()) {
            NodoNivel actual = cola.poll();
            System.out.println(actual.codigo);
            if (actual.izquierda != null) cola.offer(actual.izquierda);
            if (actual.derecha != null) cola.offer(actual.derecha);
        }
    }
}
