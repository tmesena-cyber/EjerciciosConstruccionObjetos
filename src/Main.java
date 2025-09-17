//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear clientes
        Cliente cliente1 = new Cliente("Eugenio",
                "Morales Calderón",
                "122345567",
                'm',
                "San José, Costa Rica");

        Cliente cliente2 = new Cliente("Enriqueta",
                "Álvarez Godoy",
                "514043590",
                "San José, Costa Rica");

        Cliente cliente3 = new Cliente();

        //Crear suscripciones
        Suscripcion suscripcion1 = new Suscripcion("Deluxe",
                12500,
                "Trimestral");
        Suscripcion suscripcion2 = new Suscripcion("Básico",
                4500,
                "Mensual");
        Suscripcion suscripcion3 = new Suscripcion("Anual Premium",
                60000,
                "Anual");

        //Probar funcionalidad

        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion ("Adds Free", 2500,"Mensual"));
    }
}