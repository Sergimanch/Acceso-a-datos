public class Producto{
    private String codigo;
    private String nombre;
    private double precio;
    private Categoria cat;
    private int stock;

    public Producto(String codigo, String nombre, double precio, Categoria cat){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
        this.stock = stock;
    }

    public String get_Codigo{
        return this.codigo;
    }
    public String get_nombre{
        return this.nombre;
    }
    public double get_precio{
        return this.precio;
    }
    public String get_Categoria{
        return this.cat;
    }
    public String get_Stock{
        return this.stock;
    }

}