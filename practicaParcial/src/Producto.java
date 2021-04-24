public class Producto {
    private int nroStock;
    private String nombre;
    private double precio;


    ///////////////// CONSTRUCTORES

    public Producto(int nroStock, String nombre, double precio) {
        this.nroStock = nroStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        this.nroStock = 0;
        this.nombre = "";
        this.precio = 0;
    }

    ///////////////// GETTERS

    public int getNroStock() {
        return nroStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    ///////////////// SETTERS

    public void setNroStock(int nroStock) {
        this.nroStock = nroStock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    ///////////////// OTROS
    ///////////////// OVERRIDDEN

    @Override
    public String toString() {
        return "Producto:" +
                "Stock:" + nroStock + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: $" + precio + "\n\n";
    }
}
