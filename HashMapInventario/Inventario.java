package HashMapInventario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public void mostrarInventario(){
        for(Producto prod : inv.values())
            prod.toString();
    }
    public List<Producto> mostrarProductoCategoria(Categoria cat){
        if (Categoria.existeCategoria()){
            List <Producto> milista = new ArrayList<>();
            for(Producto prod: inv.values()){
                if(prod.get_Categoria.equals(cat)){
                    milista.add(prod);
                }
            }
        }


        return milista;
    }


    public double calculoTotal(){
        Double total= 0.0;
        for(Producto prod : inv.values() )
            total += prod.todoStock();
        return total;
    }
    public void venderObjeto(String codigo,int c, int dinero){        
        if(inv.containsKey(codigo)){
            Producto p = this.inv.get(codigo);
            if(dinero>=p.get_precio() && p.get_Stock()>=c){
                p.set_Stock(p.get_Stock()-c);
                System.out.println("El objeto se ha vendido correctamente" + c + " uds de " + p.get_nombre());
            }else if(dinero<p.get_precio()||p.get_Stock()< c )
                System.out.println("No se ha podido vender el objeto");
            else
                System.out.println("Se ha producido un error");
        }
        else{
            System.out.println("El objeto no existe");
        }
    }
       

}
