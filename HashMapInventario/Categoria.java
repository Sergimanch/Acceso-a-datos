package HashMapInventario;
public enum Categoria {
    ELECTRONICA,
    ROPA,
    ALIMENTOS,
    HOGAR,
    JUGUETES;

    public static boolean existeCategoria (String nombre){
        try{
            Categoria.valueOf(nombre);
            return true;
        }catch(IllegalArgumentException iae){
            return false;
        }
    }
}