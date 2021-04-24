public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private double cantKms; //if <= 500 $500, else $1000
    private double costoTotal; //costoProd+envío


    ///////////////// CONSTRUCTORES

    public Pedido(Cliente cliente, Producto producto, double cantKms) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantKms = cantKms;
        this.setCostoTotal();
    }

    ///////////////// GETTERS

    public Cliente getCliente() {
        return cliente;
    }
    public String getDatosCliente() {
        return cliente.toString();
    }

    public Producto getProducto() {
        return producto;
    }

    public String getDatosProducto() {
        return producto.toString();
    }

    public double getCantKms() {
        return cantKms;
    }

    public double getCostoTotal() {

        return costoTotal;
    }

    ///////////////// SETTERS

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantKms(double cantKms) {
        this.cantKms = cantKms;
    }

    private void setCostoTotal() {
        double precioEnvio = 1000;
        double precioProducto= this.producto.getPrecio();

        if(this.cantKms <= 500){ //checkeo la cantidad de kms
            precioEnvio = 500;
        }
        if (this.cliente instanceof ClienteEmpresarial){ //me fijo si es un cliente empresarial
            precioEnvio = precioEnvio*0.85;
        }
        this.costoTotal = precioProducto + precioEnvio;
    }

    ///////////////// OTROS
    ///////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Pedido:" +
                this.cliente.toString() +
                this.producto.toString() +
                "Cant Kms: " + cantKms + "\n" +
                "Costo Total: " + this.costoTotal + "\n\n";
    }
}
