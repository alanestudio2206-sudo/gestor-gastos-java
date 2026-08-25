import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        System.out.println("Gestor semanal de Gastos");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> conceptos = new ArrayList<>();
        ArrayList<String> categorias = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();

        registrarGasto(conceptos, categorias, montos, scanner);
        mostrarGastos(conceptos, categorias, montos);

        scanner.close();
    }

    public static void registrarGasto(
            ArrayList<String> conceptos,
            ArrayList<String> categorias,
            ArrayList<Double> montos,
            Scanner scanner)
    {

        System.out.print("Concepto del gasto: ");
        String concepto = scanner.nextLine();

        System.out.println("Categorías disponibles:");
        System.out.println("1. Alimentos");
        System.out.println("2. Transporte");
        System.out.println("3. Materiales escolares");
        System.out.println("4. Entretenimiento");
        System.out.println("5. Otros");

        int opcionCategoria = -1;
        String categoriaSeleccionada = "";
        boolean categoriaValida = false;

        while (!categoriaValida) {
            System.out.print("Seleccione el número de categoría: ");
            opcionCategoria = scanner.nextInt();
            scanner.nextLine();

            switch (opcionCategoria) {
                case 1:
                    categoriaSeleccionada = "Alimentos";
                    categoriaValida = true;
                    break;
                case 2:
                    categoriaSeleccionada = "Transporte";
                    categoriaValida = true;
                    break;
                case 3:
                    categoriaSeleccionada = "Materiales escolares";
                    categoriaValida = true;
                    break;
                case 4:
                    categoriaSeleccionada = "Entretenimiento";
                    categoriaValida = true;
                    break;
                case 5:
                    categoriaSeleccionada = "Otros";
                    categoriaValida = true;
                    break;
                default:
                    System.out.println("Categoría no válida, intente de nuevo.");
            }
        }

        double monto = -1;
        while (monto <= 0) {
            System.out.print("Monto del gasto: ");
            monto = scanner.nextDouble();
            scanner.nextLine();
            if (monto <= 0) {
                System.out.println("El monto debe ser mayor a cero.");
            }
        }

        conceptos.add(concepto);
        categorias.add(categoriaSeleccionada);
        montos.add(monto);

        System.out.println("Gasto registrado correctamente.");
         }
    public static void mostrarGastos(
            ArrayList<String> conceptos,
            ArrayList<String> categorias,
            ArrayList<Double> montos) {

        if (conceptos.isEmpty()) {
            System.out.println("No hay gastos registrados todavía.");
            return;
        }

        System.out.println("GASTOS REGISTRADOS");
        System.out.println();

        for (int i = 0; i < conceptos.size(); i++) {
            System.out.printf("%d. %-12s | %-12s | $%.2f%n",
                    (i + 1), conceptos.get(i), categorias.get(i), montos.get(i));
             }
        }
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