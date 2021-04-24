public class ClienteParticular extends Cliente{
    private String nombreReal;

    ///////////////// CONSTRUCTORES

    public ClienteParticular(String direccion, String telefono, int cantCompras, String nombreReal) {
        super(direccion, telefono, cantCompras);
        this.nombreReal = nombreReal;
    }

    public ClienteParticular() {
        super();
        this.nombreReal = "";
    }

    ///////////////// GETTERS
    ///////////////// SETTERS

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    ///////////////// OTROS
    ///////////////// OVERRIDDEN

    @Override
    public String getName() {
        return this.nombreReal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Nombre" + nombreReal + "\n\n";
    }
}
