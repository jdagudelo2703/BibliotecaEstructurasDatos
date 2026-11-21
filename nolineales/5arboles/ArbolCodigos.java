class NodoLibro {
    int codigo;
    NodoLibro izquierda;
    NodoLibro derecha;

    NodoLibro(int codigo) { this.codigo = codigo; }
}

public class ArbolCodigos {
    static NodoLibro insertar(NodoLibro raiz, int codigo) {
        if (raiz == null) return new NodoLibro(codigo);
        if (codigo < raiz.codigo) raiz.izquierda = insertar(raiz.izquierda, codigo);
        else if (codigo > raiz.codigo) raiz.derecha = insertar(raiz.derecha, codigo);
        return raiz;
    }

    static void mostrarEnOrden(NodoLibro nodo) {
        if (nodo == null) return;
        mostrarEnOrden(nodo.izquierda);
        System.out.println(nodo.codigo);
        mostrarEnOrden(nodo.derecha);
    }

    public static void main(String[] args) {
        NodoLibro raiz = null;
        for (int codigo : new int[]{40, 20, 60, 10, 30}) raiz = insertar(raiz, codigo);
        System.out.println("Códigos ordenados:");
        mostrarEnOrden(raiz);
    }
}
