import java.util.HashMap;

public class Inventario {
    private String nomEmpresa;
    private HashMap<String, Producto> inv;


    public Inventario(String nomEmpresa){
        this.inv = new HashMap<String, Producto>();
        this.nomEmpresa = nomEmpresa;
    }
    public void agregarProducto(Producto p){
        this.inv.put(p.get_Codigo(), p);
        if(!inv.containsKey(p.get_Codigo()))
        System.out.println("Producto" + p.get_Codigo() + "agregado correctamente.");
        else System.out.println("Error");
    }   
    public void modificarStock(int newStock, String code){         
        Producto p = this.inv.get(code);
        if(p != null){
            p.set_Stock(newStock);
            System.out.println("El stock ha cambiado");
        }else
            System.out.println("El producto no existe");
         

        System.out.println("El stock ha cambiado.");
    }   
    public void tamañoInventario(){
        System.out.println("El tamaño del inventario es " +  inv.size());
    }
    public void venderObjeto(String codigo, int dinero){
        Producto p = this.inv.get(codigo);
        if(dinero>=p.get_precio()){
            p.set_Stock(p.get_Stock()-1);
            System.out.println("El objeto se ha vendido correctamente");
        }else if(dinero<p.get_precio()||p.get_Stock()== 0 )
            System.out.println("No se ha podido vender el objeto");
        else
            System.out.println("Se ha producido un error");
        
        
    }

}
