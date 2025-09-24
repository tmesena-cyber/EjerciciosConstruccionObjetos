public class Suscripcion {
    private String tipo;
    private int costo;
    private String periodicidad;

        //Métodos
    //Constructores
    public Suscripcion (String pTipo,
                 int pCosto,
                 String pPeriodicidad){
            tipo = pTipo;
            costo = pCosto;
            periodicidad = pPeriodicidad;
    }

    //Getters
    public String getTipo(){
        return tipo;
    }
    public int getCosto(){
        return costo;
    }
    public String getPeriodicidad(){
        return periodicidad;
    }

    //Setters
    public void setTipo(String nuevoTipo){
        tipo = nuevoTipo;
    }
    public void setCosto(int nuevoCosto){
        costo = nuevoCosto;
    }

    public void setPeriodicidad(String nuevaPeriodicidad) {
        periodicidad = nuevaPeriodicidad;
    }

    //Equals
    public boolean equals (Suscripcion pSuscripcion){
        return tipo.equals(pSuscripcion.tipo) &&
                periodicidad.equals(pSuscripcion.periodicidad);
    }

    //toStrings
    public String toString(){
        return "Tipo: " + tipo + "\nCosto: ₡" + costo + "\nPeriodicidad: " + periodicidad + "\n";
    }
}
