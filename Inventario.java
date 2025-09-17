import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> inv;


    public Inventario(){
    }
    public Producto agregarProducto(Producto prod){
        inv = prod.add;
    }

}
