import java.util.ArrayList;

public class Inventario2 {
    private String nomEmpresa;
    private ArrayList<Producto> inv; 

    public Inventario2(String nomEmpresa) {
        this.inv = new ArrayList<>(); 
        this.nomEmpresa = nomEmpresa;
    }

    public void agregarProducto(Producto p) {
        for (Producto prod : inv) {
            if (prod.get_Codigo().equals(p.get_Codigo())) {
                System.out.println("Error: El producto con código " + p.get_Codigo() + " ya existe.");
                return;
            }
        }
        inv.add(p); 
        System.out.println("Producto " + p.get_Codigo() + " agregado correctamente.");
    }

    public void modificarStock(int newStock, String code) {
        for (Producto prod : inv) {
            if (prod.get_Codigo().equals(code)) {
                prod.set_Stock(newStock); 
                System.out.println("El stock ha cambiado a " + newStock + " para el producto con código " + code);
                return;
            }
        }
        System.out.println("Error: El producto con código " + code + " no existe.");
    }

    public void tamañoInventario() {
        System.out.println("El tamaño del inventario es " + inv.size());
    }

    public void venderObjeto(String codigo, int dinero) {
        for (Producto prod : inv) {
            if (prod.get_Codigo().equals(codigo)) {
                if (dinero >= prod.get_precio()) {
                    if (prod.get_Stock() > 0) {
                        prod.set_Stock(prod.get_Stock() - 1); 
                        System.out.println("El objeto se ha vendido correctamente. Stock restante: " + prod.get_Stock());
                    } else {
                        System.out.println("No hay stock disponible para este producto.");
                    }
                } else {
                    System.out.println("Dinero insuficiente para comprar el producto.");
                }
                return;
            }
        }
        System.out.println("Error: El producto con código " + codigo + " no existe.");
    }
}