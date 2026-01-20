import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VentaDeVehiculos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] modelos = {
                "Fiat 500",
                "Renault Kwid",
                "Ford Mustang"
        };

        double[] precios = {
                110000,
                200000,
                780000
        };

        String[] caracteristicas = {
                "Auto pequeño automático",
                "crossover manual",
                "Deportivo V8"
        };

        double total = 0;
        boolean seguir = true;

        System.out.println("=== Garay Automotris ===");
        System.out.print("Nombre del cliente: ");
        String cliente = sc.nextLine();

        while (seguir) {

            System.out.println("\nVehículos disponibles:");
            for (int i = 0; i < modelos.length; i++) {
                System.out.println((i + 1) + ". " + modelos[i]);
                System.out.println("   Precio: $" + precios[i]);
                System.out.println("   Características: " + caracteristicas[i]);
            }

            System.out.print("\nElige un vehículo (1-3): ");
            int opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= modelos.length) {
                total += precios[opcion - 1];
                System.out.println("Vehículo agregado correctamente.");
            } else {
                System.out.println("Opción incorrecta.");
            }

            System.out.print("¿Deseas agregar otro vehículo? (s/n): ");
            char respuesta = sc.next().toLowerCase().charAt(0);
            seguir = respuesta == 's';
        }

        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\n======= TICKET DE VENTA =======");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + fecha.format(formato));
        System.out.println("Total a pagar: $" + total);
        System.out.println("Gracias por tu preferencia 🚗");
        System.out.println("===============================");

        sc.close();
    }
}
