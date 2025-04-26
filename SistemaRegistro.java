import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaRegistro {
    private List<Usuario> usuarios;

    public SistemaRegistro() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Usuario ===");

        String nombre;
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            if (!Validador.validarNombre(nombre)) {
                System.out.println("Nombre inválido. Solo letras y espacios permitidos (2-50 caracteres).");
            }
        } while (!Validador.validarNombre(nombre));

        String correo;
        do {
            System.out.print("Ingrese su correo electrónico: ");
            correo = scanner.nextLine();
            if (!Validador.validarCorreo(correo)) {
                System.out.println("Correo electrónico inválido.");
            }
        } while (!Validador.validarCorreo(correo));

        String contrasena;
        do {
            System.out.print("Ingrese su contraseña: ");
            contrasena = scanner.nextLine();
            if (!Validador.validarContrasena(contrasena)) {
                System.out.println("Contraseña inválida. Debe tener mínimo 8 caracteres, incluir mayúsculas, minúsculas, números y caracteres especiales.");
            }
        } while (!Validador.validarContrasena(contrasena));

        usuarios.add(new Usuario(nombre, correo, contrasena));
        System.out.println("Usuario registrado exitosamente.\n");
    }

    public void mostrarUsuarios() {
        System.out.println("\n=== Usuarios Registrados ===");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Correo: " + usuario.getCorreo());
        }
    }
}
