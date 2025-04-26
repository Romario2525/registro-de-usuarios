import java.util.regex.Pattern;

public class Validador {

    public static boolean validarNombre(String nombre) {
        return Pattern.matches("^[A-Za-zÁÉÍÓÚáéíóúñÑ ]{2,50}$", nombre);
    }

    public static boolean validarCorreo(String correo) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$", correo);
    }

    public static boolean validarContrasena(String contrasena) {
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", contrasena);
    }
}
