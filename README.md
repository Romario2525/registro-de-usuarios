# Registro de Usuarios en Java

Este proyecto de consola en Java permite registrar usuarios validando su información mediante expresiones regulares. El programa utiliza principios de Programación Orientada a Objetos (POO) para mantener un código limpio y organizado.

## Funcionalidades

- Registro de usuarios solicitando:
  - Nombre (solo letras y espacios, de 2 a 50 caracteres)
  - Correo electrónico válido
  - Contraseña segura (mínimo 8 caracteres, al menos una mayúscula, una minúscula, un número y un carácter especial)
- Visualización de usuarios registrados
- Validación de entradas usando **expresiones regulares**

## Estructura del Proyecto

- `Usuario.java` - Clase que representa al usuario.
- `Validador.java` - Clase que contiene métodos para validar nombre, correo y contraseña.
- `SistemaRegistro.java` - Lógica de registro y almacenamiento de usuarios.
- `Main.java` - Clase principal que ejecuta el programa.

## Requisitos

- Java 8 o superior
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans
- Git (opcional para clonar el repositorio)

## Cómo ejecutar

1. Clona el repositorio:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

2. Abre el proyecto en tu IDE favorito.

3. Compila y ejecuta el archivo `Main.java`.

## Ejemplo de uso

```
1. Registrar nuevo usuario
2. Mostrar usuarios registrados
3. Salir
Seleccione una opción: 1
Ingrese su nombre: Juan Pérez
Ingrese su correo electrónico: juan.perez@example.com
Ingrese su contraseña: ContraseñaSegura1!
Usuario registrado exitosamente.
```

## Autor

- Romario Ramirez
