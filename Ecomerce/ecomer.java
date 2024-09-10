class Cliente{
    private String nombre;
    private String direccion;

    public Cliente (String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    
}

class Pedido {
    private int numPedido;
    private String[] articulos;
    private Cliente cliente;

    public Pedido( int numPedido, String[] articulos, Cliente cliente){
        this.numPedido = numPedido;
        this.articulos = articulos;
        this.cliente = cliente;
    }
    public int getNumPedido(){
        return numPedido;
    }
    public String[] getArticulos(){
        return articulos;
    }
    public Cliente getCliente(){
        return cliente;
    }
}

class Pago {
    private int numPedido;
    private String metodoPago;
    private double total;

    public Pago(int numPedido, String metodoPago, double total){
        this.numPedido = numPedido;
        this.metodoPago = metodoPago;
        this.total = total;
    }
    public int getNumPedido(){
        return numPedido;
    }
    public String getMetodoPago(){
        return metodoPago;
    }
    public double getTotal(){
        return total;
    }
}

class Notificacion {
    private int numPedido;
    private String guia;
    private String fechaEntrega;
    private String correo;

    public Notificacion(int numPedido, String guia, String fechaEntrega, String correo){
        this.numPedido = numPedido;
        this.guia = guia;
        this.fechaEntrega = fechaEntrega;
        this.correo = correo;
    }
    public int getNumPedido(){
        return numPedido;
    }
    public String getGuia(){
        return guia;
    }
    public String getFechaEntrega(){
        return fechaEntrega;
    }
    public String getCorreo(){
        return correo;
    }
}

public class ecomer {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("PEPE AGUILAR", "Calle Manzanilla 204");

        String[] articulos = {"Xbox", "Pantalla", "Laptop"};
    
        Pedido pedido = new Pedido(1, articulos, null);

        Pago pago = new Pago(1, "tarjeta", 10500.75);

        Notificacion notificacion = new Notificacion(1, "456", "15/10/24", "pepe@gmail.com");

        System.out.println("Pedido del cliente: " + pedido.getCliente().getNombre());
        System.out.println("Dirección: " + pedido.getCliente().getDireccion());
        System.out.println("Artículos: " + String.join(", ", pedido.getArticulos()));
        System.out.println("Método de pago: " + pago.getMetodoPago());
        System.out.println("Total: " + pago.getTotal());
        System.out.println("Guía de entrega: " + notificacion.getGuia());
        System.out.println("Fecha estimada de entrega: " + notificacion.getFechaEntrega());
        System.out.println("Correo de notificación: " + notificacion.getCorreo());
    }
}
