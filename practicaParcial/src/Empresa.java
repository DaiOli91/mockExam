import java.util.ArrayList;

public class Empresa {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;

    ///////////////// CONSTRUCTORES

    public Empresa() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    ///////////////// GETTERS

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    ///////////////// SETTERS

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    ///////////////// OTROS
    ///////////////// OVERRIDDEN
}
