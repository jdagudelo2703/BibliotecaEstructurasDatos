public class ContarEjemplares {
    public static void main(String[] args) {
        int[] ejemplaresPorLibro = {4, 2, 7, 1};
        int total = 0;
        for (int cantidad : ejemplaresPorLibro) total += cantidad;
        System.out.println("Ejemplares registrados: " + total);
    }
}
