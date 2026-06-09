import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SistemaPrincipal {
    private  ArbolCategorias arbol;
    private GrafoPeliculas grafo;
    private  Stack<Pelicula> historial;
    private LinkedList<Pelicula> wishlist;

    public SistemaPrincipal() {
        arbol = new ArbolCategorias();
        grafo = new GrafoPeliculas();
        historial = new Stack<>();
        wishlist = new LinkedList<>();
    }

    public ArbolCategorias getArbol() {
        return arbol;
    }

    public GrafoPeliculas getGrafo() {
        return grafo;
    }

    public void AgregarPelicula(String categoria, Pelicula pelicula){
        arbol.insertarPelicula(categoria, pelicula);

        grafo.agregarPelicula(pelicula);
    }

    public Pelicula buscarPelicula(String nombre){
        return arbol.buscarPelicula(nombre);
    }

    public void verPelicula(String nombre){

            Pelicula pelicula =
                    buscarPelicula(nombre);

            if(pelicula == null){
                return;
            }

            if(pelicula.isVista()){
                System.out.println(
                        "Ya viste esta pelicula"
                );
                return;
            }

            pelicula.setVista(true);

            historial.push(pelicula);

            System.out.println(
                    "Pelicula vista: "
                            + pelicula.getNombre()
            );
    }

    public void agregarWishlist(String nombre){

        Pelicula pelicula =
                buscarPelicula(nombre);

        if(pelicula != null && !wishlist.contains(pelicula)){

            wishlist.add(pelicula);
            System.out.println(
                    "Agregada a wishlist"
            );
        }
        else {
            System.out.println("Pelicula ya agregada a la wishlist");
        }
    }

    public void mostrarWishlist(){
        if(wishlist.isEmpty()){
            System.out.println("La wishlist esta vacia");
        }
        else {
            System.out.println("WISHLIST:");
            for(Pelicula p: wishlist){
                System.out.println(p.getNombre());
            }
        }

    }


    public List<Pelicula> recomendar(
            String nombre
    ){

        Pelicula pelicula =
                buscarPelicula(nombre);

        if(pelicula == null){
            return new ArrayList<>();
        }

        return grafo.obtenerRecomendaciones(
                pelicula
        );
    }

    public void explorarDirector(String nombrePelicula){

        grafo.explorarDirector(
                nombrePelicula
        );
    }


    public void mostrarHistorial(){

        if(historial.isEmpty()){

            System.out.println(
                    "No has visto ninguna pelicula"
            );

            return;
        }

        System.out.println(
                "\n=== HISTORIAL ==="
        );

        for(int i = historial.size() - 1; i >= 0; i--){

            System.out.println(
                    historial.get(i).getNombre()
            );
        }
    }
}
