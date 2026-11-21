class NodoBusqueda {
    int codigo;
    NodoBusqueda izquierda, derecha;
    NodoBusqueda(int codigo) { this.codigo = codigo; }
}

public class BuscarCodigo {
    static NodoBusqueda insertar(NodoBusqueda nodo, int codigo) {
        if (nodo == null) return new NodoBusqueda(codigo);
        if (codigo < nodo.codigo) nodo.izquierda = insertar(nodo.izquierda, codigo);
        else if (codigo > nodo.codigo) nodo.derecha = insertar(nodo.derecha, codigo);
        return nodo;
    }

    static boolean existe(NodoBusqueda nodo, int codigo) {
        if (nodo == null) return false;
        if (nodo.codigo == codigo) return true;
        return codigo < nodo.codigo ? existe(nodo.izquierda, codigo) : existe(nodo.derecha, codigo);
    }

    public static void main(String[] args) {
        NodoBusqueda raiz = null;
        for (int codigo : new int[]{50, 25, 75, 10, 30}) raiz = insertar(raiz, codigo);
        int buscado = 30;
        System.out.println(existe(raiz, buscado) ? "Código encontrado: " + buscado : "Código no encontrado.");
    }
}
