import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestor semanal de Gastos");
    }

    public static double calcularTotal(ArrayList<Double> montos) {
        double total = 0;
        for (double m : montos) {
            total += m;
        }
        return total;
    }

    public static int obtenerPosicionGastoMayor(ArrayList<Double> montos) {
        if (montos.isEmpty()) {
            return -1;
        }
        int posicionMayor = 0;
        for (int i = 1; i < montos.size(); i++) {
            if (montos.get(i) > montos.get(posicionMayor)) {
                posicionMayor = i;
            }
        }
        return posicionMayor;
    }


    public static double calcularTotalPorCategoria(
            ArrayList<String> categorias,
            ArrayList<Double> montos,
            String categoriaBuscada) {

        double total = 0;
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).equalsIgnoreCase(categoriaBuscada)) {
                total += montos.get(i);
            }
        }
        return total;
    }


    public static void mostrarResumen(
            ArrayList<String> conceptos,
            ArrayList<String> categorias,
            ArrayList<Double> montos) {

        if (conceptos.isEmpty()) {
            System.out.println("No hay gastos registrados para enseñar.");
            return;
        }

        double total = calcularTotal(montos);
        double promedio = total / conceptos.size();
        int posicionMayor = obtenerPosicionGastoMayor(montos);

        System.out.println("RESUMEN SEMANAL");
        System.out.println();
        System.out.println("Número de gastos: " + conceptos.size());
        System.out.printf("Gasto total: $%.2f%n", total);
        System.out.printf("Promedio x gasto: $%.2f%n", promedio);
        System.out.printf("Gasto mayor: %s, $%.2f%n",
                conceptos.get(posicionMayor), montos.get(posicionMayor));
    }
}