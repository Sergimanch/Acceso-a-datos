package ejercicioparcial;

public class Main {
    public static void main ( String [] args ) {
Carrito1 cart = new Carrito1() ;

cart . addProducto (" manzana ", 3) ;
cart . addProducto (" leche ", 2) ;
cart . addProducto (" pan", 1) ;
cart . displayCarrito () ;

cart . updateQuantity (" manzana ", 5) ;
cart . removeProduct (" pan") ;
cart . displayCart () ;

cart . addProduct (" chocolate ", 1) ;
cart . addProduct (" naranja ", 10) ;
cart . displayCart () ;
}
}
