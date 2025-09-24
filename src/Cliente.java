public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private char genero;
    private String ubicacion;

        //Métodos
    //Constructores
    public Cliente(String pNombre,
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
    public Cliente(String pNombre,
            String pApellidos,
            String pCedula,
            String pUbicacion){
        nombre = pNombre;
        apellidos = pApellidos;
        cedula = pCedula;
        ubicacion = pUbicacion;
    }
    public Cliente(){}

    //Funcionalidad
    public void suscribirse(Suscripcion pSuscripcion){
        System.out.println("•" + nombre + " adquirió una suscripción " + pSuscripcion.getPeriodicidad() + "\n");
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCedula() {
        return cedula;
    }
    public char getGenero() {
        return genero;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    //Setters
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public void setApellidos(String nuevoApellidos) {
        apellidos = nuevoApellidos;
    }
    public void setCedula (String nuevaCedula){
        cedula = nuevaCedula;
    }
    public void setGenero (char nuevoGenero){
        genero = nuevoGenero;
    }
    public void setUbicacion (String nuevaUbicacion){
        ubicacion = nuevaUbicacion;
    }

    //Equals
    public boolean equals(Cliente pPersona){
        return cedula.equals(pPersona.cedula);
    }

    //toStrings
    public String toString(){
        return "Nombre: " + nombre + " " + apellidos + "\nCédula: " + cedula + "\nGénero: " + genero + "\nUbicación:" + ubicacion + "\n";
    }
}
