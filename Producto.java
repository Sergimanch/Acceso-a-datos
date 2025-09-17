public class Producto{
    private String codigo;
    private String nombre;
    private Double precio;
    private Categoria cat;
    private int stock;

    public Producto(String codigo, String nombre, double precio, Categoria cat, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
        this.stock = stock;
    }

    public String get_Codigo(){
        return this.codigo;
    }
    public String get_nombre(){
        return this.nombre;
    }
    public Double get_precio(){
        return this.precio;
    }
    public Categoria get_Categoria(){
        return this.cat;
    }
    public int get_Stock(){
        return this.stock;
    }
     public void set_Precio(Double precio){
        this.precio = precio;
    }
    public void set_Stock(int stock){
        this.stock = stock;
    }

    public double todoStock(){
        return stock * precio;
    }

}