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

}