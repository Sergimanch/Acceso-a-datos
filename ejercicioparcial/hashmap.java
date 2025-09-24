package ejercicioparcial;

// Almacenar nombre de producto y cantidad
private HashMap <String , Integer > cart ;
// Almacenar nombre de producto y precio
private HashMap <String , Double > prices ;

public ShoppingCart() {
this . cart = new HashMap < >();
this . prices = new HashMap < >();

this . prices . put(" manzana ", 0.50) ;
this . prices . put(" platano ", 0.30) ;
this . prices . put(" naranja ", 0.60) ;
this . prices . put(" leche ", 2.50) ;
this . prices . put(" pan", 1.50) ;
}


// Metodo main cuya salida por pantalla aparece mas abajo
public static void main ( String [] args ) {
 ShoppingCart cart = new ShoppingCart () ;

cart . addProduct (" manzana ", 3) ;
cart . addProduct (" leche ", 2) ;
cart . addProduct (" pan", 1) ;
cart . displayCart () ;

cart . updateQuantity (" manzana ", 5) ;
cart . removeProduct (" pan") ;
cart . displayCart () ;
cart . addProduct (" chocolate ", 1) ;
cart . addProduct (" naranja ", 10) ;
cart . displayCart () ;
}