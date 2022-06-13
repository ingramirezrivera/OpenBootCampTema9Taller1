package Package;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Pedro";
        cliente.edad = 33;
        cliente.telefono = "3135467879";
        cliente.credito = "Libre inversión";

    }

    class Persona{
        int edad;
        String nombre;
        String telefono;

    }

    static class Cliente extends Persona{
        String credito;
    }

    Class Trabajador{
        int salario;
    }
}
