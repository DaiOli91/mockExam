public abstract class Cliente {
    private String direccion;
    private String telefono;
    private int cantCompras; //conteo por instancia

  ///////////////// CONSTRUCTORES

    public Cliente(String direccion, String telefono, int cantCompras) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantCompras = cantCompras;
    }
    public Cliente() {
        this.direccion = "";
        this.telefono = "";
        this.cantCompras = 0;
    }

    ///////////////// GETTERS

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    ///////////////// SETTERS

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCantCompras() { //las compras se cuentan de a una independientemente del nro de items
        this.cantCompras++;
    }

    ///////////////// OTROS- ABSTRACTS
    public abstract String getName(); //obligo a las hijas a tener un nombre

    ///////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Cliente" +
                "Direccion: " + direccion + '\n' +
                "Telefono: " + telefono + '\n'; //no interesa mostrar la cantidad de compras realizadas
    }
}
