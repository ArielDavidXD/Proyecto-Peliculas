import java.util.ArrayList;
import java.util.List;

public class NodoArbol {
    private String categoria;
    private List<NodoArbol> listaNodos;
    private List<Pelicula> listaPeliculas;


    public NodoArbol(String categoria) {
        this.categoria = categoria;
        this.listaNodos = new ArrayList<>();
        this.listaPeliculas = new ArrayList<>();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<NodoArbol> getListaNodos() {
        return listaNodos;
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public void agregarCategoria(NodoArbol hijo) {
        listaNodos.add(hijo);
    }

    public void setListaNodos(List<NodoArbol> listaNodos) {
        this.listaNodos = listaNodos;
    }

    public void agregarPelicula(Pelicula hijo) {
        listaPeliculas.add(hijo);
    }
}
