package ejercicioparcial;

import java.util.HashMap;

    public class Carrito1 {
    // Almacenar nombre de producto y cantidad
        private HashMap <String , Integer > cart ;
    // Almacenar nombre de producto y precio
        private HashMap <String , Double > prices ;

        public void ShoppingCart() {
            this . cart = new HashMap < >();
            this . prices = new HashMap < >();
            this . prices . put(" manzana ", 0.50) ;
            this . prices . put(" platano ", 0.30) ;
            this . prices . put(" naranja ", 0.60) ;
            this . prices . put(" leche ", 2.50) ;
            this . prices . put(" pan", 1.50) ;
        }

        public void addProducto(String nombre, Integer cantidad){
                if(prices.containsKey(nombre)){
                   this.cart.put(nombre, cantidad + cart.get(nombre));
                   System.out.println("Agregado" + cantidad + nombre + "(s) al carrito");
                }else
                System.out.println("No se ha podido agregar el producto");
        }
        public void eliminarProducto(String nombre, Integer cantidad){
                if(prices.containsKey(nombre)){
                   this.cart.put(nombre, cantidad - cart.get(nombre));
                   System.out.println("Agregado" + cantidad + nombre + "(s) al carrito");
                }else
                System.out.println("No se ha podido agregar el producto");
        }
}

