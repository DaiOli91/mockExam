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

    public void agregarCliente (Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarProducto (Producto producto){
        this.productos.add(producto);
    }

    public int agregarPedido(Pedido pedido){ //devuelve 1 si lo agregó
        int flag = 0;

        if (pedido.getProducto().getNroStock() >= 1) //corroboro que haya stock internamente por las dudas

    {
        this.pedidos.add(pedido);
        flag = 1;
    }
        return flag;
    }

    public double calcularPromedioCostos(){
        double sumaCostos = 0;
        double promedio = 0;
        if (!this.pedidos.isEmpty()){

        for (Pedido aux_pedido : this.pedidos
             ) {
            sumaCostos += aux_pedido.getCostoTotal();

        }
            promedio = sumaCostos / pedidos.size();
        }
        return promedio;
    }

    public String getClienteConMasVentas(){
        String message = "No hay clientes disponibles";

        if(!this.clientes.isEmpty()){
            //  studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge());
            this.clientes.sort((Cliente c1, Cliente c2)-> c1.getCantCompras()-c2.getCantCompras());
            message = this.clientes.get(0).toString();
        }
        return message;
    }
    ///////////////// OVERRIDDEN
}
