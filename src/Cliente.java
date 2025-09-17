public class Cliente {
    String nombre;
    String apellidos;
    String cedula;
    char genero;
    String ubicacion;

        //Métodos
    //Constructores
    Cliente(String pNombre,
            String pApellidos,
            String pCedula,
            char pGenero,
            String pUbicacion){
        nombre = pNombre;
        apellidos = pApellidos;
        cedula = pCedula;
        genero = pGenero;
        ubicacion = pUbicacion;
    }
    Cliente(String pNombre,
            String pApellidos,
            String pCedula,
            String pUbicacion){
        nombre = pNombre;
        apellidos = pApellidos;
        cedula = pCedula;
        ubicacion = pUbicacion;
    }
    Cliente(){}
    //Funcionalidad

    void suscribirse(Suscripcion pSuscripcion){
        System.out.println(nombre + " adquirió una suscripción " + pSuscripcion.periodicidad);
    }
}
