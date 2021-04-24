public class ClienteEmpresarial extends Cliente{
    private String nombreFantasia;

    ///////////////// CONSTRUCTORES

    public ClienteEmpresarial(String direccion, String telefono, int cantCompras, String nombreFantasia) {
        super(direccion, telefono, cantCompras);
        this.nombreFantasia = nombreFantasia;

    }

    public ClienteEmpresarial() {
        super();
        this.nombreFantasia = "";
    }

    ///////////////// GETTERS
    ///////////////// SETTERS

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    ///////////////// OTROS
    ///////////////// OVERRIDDEN

    @Override
    public String getName() {
        return this.nombreFantasia;
    }

    @Override
    public String toString() {
        return "\n" + "Empresa" + "\n" +
                "Nombre: " + nombreFantasia +  "\n" +
                super.toString();
    }
}
