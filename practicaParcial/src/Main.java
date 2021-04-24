import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Cliente aux_cliente;
        Producto aux_producto;
        Pedido aux_pedido;
        Empresa empresa = new Empresa();

        String nombre;
        String direccion;
        String telefono;
        int flag = 1;
        int tipoCliente;

        int nroStock;
        double precio;

        double cantKm;
        int contador;
/*
        ////////////////////////////////1.- CREAR CLASES Y ATRIBUTOS


        /////////////////////////////////2.- INGRESAR POR TECLADO CLIENTES Y PRODUCTOS
        //mostrar datos y confirmar el pedido antes de agregarlo


        while (flag != 0) {
            System.out.println("Ingresando clientes");

            System.out.println("Hola, por favor ingrese 1 para Cliente Particular, o 2 para Cliente Empresarial");
            tipoCliente = scan.nextInt();

            System.out.println("Ingrese un nombre apropiado:");
            scan.nextLine();
            nombre = scan.nextLine();

            System.out.println("Ingrese un telefono:");
            telefono = scan.nextLine();

            System.out.println("Ingrese una direccion:");
            direccion = scan.nextLine();


            if (tipoCliente == 1) {
                aux_cliente = new ClienteParticular(direccion, telefono, 0, nombre);
                empresa.agregarCliente(aux_cliente);
                System.out.println("Se agregó el cliente particular: " + aux_cliente.toString());

            } else if (tipoCliente == 2) {
                aux_cliente = new ClienteEmpresarial(direccion, telefono, 3, nombre);
                empresa.agregarCliente(aux_cliente);
                System.out.println("Se agregó la empresa: " + aux_cliente.toString());


            }

            System.out.println("Presione 0 para terminar la carga");
            flag = scan.nextInt();
        }


        while (flag != 1) {
            System.out.println("Ingresando productos");

            System.out.println("Ingrese un nombre para el producto:");
            scan.nextLine();
            nombre = scan.nextLine();

            System.out.println("Ingrese un stock");
            nroStock = scan.nextInt();

            System.out.println("Ingrese un precio:");

            precio = scan.nextDouble();

            aux_producto = new Producto(nroStock, nombre, precio);
            empresa.agregarProducto(aux_producto);
            System.out.println("Se agregó el producto: " + aux_producto.toString());
            System.out.println("Presione 1 para terminar la carga");
            flag = scan.nextInt();
        }

        System.out.println("CLIENTES:" + empresa.getClientes().toString());
        System.out.println("PRODUCTOS:" + empresa.getProductos().toString());


        ///////////////////////////////////////3.- REALICE UN NUEVO PEDIDO POR TECLADO JUNTO CON SUS VALIDACIONES

        System.out.println("Ingresando un pedido");
        aux_cliente = new ClienteParticular("Solis 5526", "4729869", 5, "Sarah Leiva");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_producto = new Producto(300, "Osos peluche", 300);
        empresa.agregarProducto(aux_producto);
        double cantKm;
        System.out.println("Ingrese cantidad de kms para el envio");
        cantKm = scan.nextDouble();


        aux_pedido = new Pedido(aux_cliente, aux_producto, cantKm);
        System.out.println("Su pedido es:" + aux_pedido.toString());
        System.out.println("Por favor presione 3 si el pedido es correcto:");
        tipoCliente = scan.nextInt();
        if (tipoCliente == 3) {
            flag = empresa.agregarPedido(aux_pedido); //validación hecha antes de agregar
        }
        if (flag == 1) System.out.println("Se agregó el pedido" + aux_pedido.toString());
        tipoCliente = empresa.getProductos().indexOf(aux_producto);
        System.out.println("El stock remanente es:" + empresa.getProductos().get(tipoCliente).getNroStock());


        ////////////////////////////////////////////4.- REALIZAR 5 VENTAS POR CONSOLA Y MOSTRAR EL PROMEDIO DE TOTALES VENDIDOS
        System.out.println("Ingresando un pedido");
        aux_cliente = new ClienteParticular("Solis 5526", "4729869", 5, "Sarah Leiva");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_producto = new Producto(300, "Osos peluche", 300);
        empresa.agregarProducto(aux_producto);
        contador = 5;

        while(contador>0){
            System.out.println("Ingrese cantidad de kms para el envio");
            cantKm = scan.nextDouble();

            aux_pedido = new Pedido(aux_cliente, aux_producto, cantKm);
            System.out.println("Su pedido es:" + aux_pedido.toString());
            System.out.println("Por favor presione 3 si el pedido es correcto:");
            tipoCliente = scan.nextInt();
            if (tipoCliente == 3) {
                flag = empresa.agregarPedido(aux_pedido); //validación hecha antes de agregar
            }
            if (flag == 1) System.out.println("Se agregó el pedido" + aux_pedido.toString());
            tipoCliente = empresa.getProductos().indexOf(aux_producto);
            System.out.println("El stock remanente es:" + empresa.getProductos().get(tipoCliente).getNroStock());
            contador--;
        }
        System.out.println("El promedio de costos es:" + empresa.calcularPromedioCostos());
*/

        /////////////////////////////////5.- INDICAR POR CONSOLA EL CLIENTE CON MÁS COMPRAS
        aux_cliente = new ClienteParticular("Solis 8754", "4729889", 5, "Martin Gutierrez");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_cliente = new ClienteParticular("Peña 5555", "4725555", 8, "Tomas Aubone");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_cliente = new ClienteParticular("Gaboto 2222", "4722222", 23, "Joaquin Gonzales");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_cliente = new ClienteParticular("Catamarca 3333", "4729879", 3, "Sarah Leiva");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock
        aux_cliente = new ClienteParticular("La rioja 3333", "4725656", 1, "Carolina Graziano");
        empresa.agregarCliente(aux_cliente); //para buscar cliente con mayor stock

       // System.out.println(empresa.getClientes().toString());

        System.out.println("El cliente con màs ventas es: " + empresa.getClienteConMasVentas());


    }
}
