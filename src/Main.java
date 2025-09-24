//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear clientes
        Cliente cliente1 = new Cliente("Eujenio",
                "Moralez Calberon",
                "922345567",
                'n',
                "Sam josé, Costa Rita");
        System.out.println(cliente1.getNombre());
        cliente1.setNombre("Eugenio");
        System.out.println(cliente1.getNombre());

        System.out.println(cliente1.getApellidos());
        cliente1.setApellidos("Morales Calderón");
        System.out.println(cliente1.getApellidos());

        System.out.println(cliente1.getCedula());
        cliente1.setCedula("122345567");
        System.out.println(cliente1.getCedula());

        System.out.println(cliente1.getGenero());
        cliente1.setGenero('m');
        System.out.println(cliente1.getGenero());

        System.out.println(cliente1.getUbicacion());
        cliente1.setUbicacion("San José, Costa Rica");
        System.out.println(cliente1.getUbicacion() + "\n");

        Cliente cliente2 = new Cliente("Enriqueta",
                "Álvarez Godoy",
                "514043590",
                "San José, Costa Rica");
        System.out.println(cliente2);

        Cliente cliente3 = new Cliente();
        System.out.println(cliente3);

        //Crear suscripciones
        Suscripcion suscripcion1 = new Suscripcion("Delucs",
                12501,
                "Trinestral");

        System.out.println(suscripcion1.getTipo());
        suscripcion1.setTipo("Deluxe");
        System.out.println(suscripcion1.getTipo());

        System.out.println(suscripcion1.getCosto());
        suscripcion1.setCosto(12500);
        System.out.println(suscripcion1.getCosto());

        System.out.println(suscripcion1.getPeriodicidad());
        suscripcion1.setPeriodicidad("Trimestral");
        System.out.println(suscripcion1.getPeriodicidad() + "\n");

        Suscripcion suscripcion2 = new Suscripcion("Básico",
                4500,
                "Mensual");
        System.out.println(suscripcion2);

        Suscripcion suscripcion3 = new Suscripcion("Anual Premium",
                60000,
                "Anual");
        System.out.println(suscripcion3);


        //Probar funcionalidad
        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion ("Adds Free", 2500,"Mensual"));
    }
}