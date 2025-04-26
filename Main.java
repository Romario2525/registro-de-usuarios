import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaRegistro sistema = new SistemaRegistro();
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("\n1. Registrar nuevo usuario");
            System.out.println("2. Mostrar usuarios registrados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    sistema.registrarUsuario();
                    break;
                case 2:
                    sistema.mostrarUsuarios();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}