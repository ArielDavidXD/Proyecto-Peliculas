public class ArbolCategorias {
    private NodoArbol raiz;

    public ArbolCategorias() {
       this.raiz = new NodoArbol("Peliculas");
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void insertarPelicula(String categoria, Pelicula pelicula){
        NodoArbol nodoPadre = buscarCategoria(raiz, categoria);
        if (nodoPadre != null) {
            nodoPadre.agregarPelicula(pelicula);
        } else {
            System.out.println("categoria no encontrado");
        }
    }

    public void insertarCategoria(String nombreCategoria){
        NodoArbol nodoNuevo = new NodoArbol(nombreCategoria);
        raiz.agregarCategoria(nodoNuevo);
    }

    private NodoArbol buscarCategoria(NodoArbol actual, String dato) {
        if (actual == null) {
            return null;
        }
        if (actual.getCategoria().equals(dato)) {
            return actual;
        }

        for (NodoArbol hijos : actual.getListaNodos()) {
            NodoArbol resultadp = buscarCategoria(hijos, dato);
            if (resultadp != null) {
                return resultadp;
            }
        }
        return null;
    }


    private Pelicula buscarPeliculaRE(NodoArbol actual, String dato) {
        if (actual == null) {
            return null;
        }
        for(Pelicula pelicula: actual.getListaPeliculas()){
            if(pelicula.getNombre().equalsIgnoreCase(dato)){
                return pelicula;
            }
        }

        for (NodoArbol hijos : actual.getListaNodos()) {
            Pelicula resultadp = buscarPeliculaRE(hijos, dato);
            if (resultadp != null) {
                return resultadp;
            }
        }
        return null;
    }

    public Pelicula buscarPelicula(String nombrePeli){
        return buscarPeliculaRE(raiz, nombrePeli);
    }


    private void mostrarPreordenRE(NodoArbol actual){

        if(actual == null){
            return;
        }


        System.out.println("CATEGORIA: " + actual.getCategoria().toUpperCase());
            for(Pelicula pelicula : actual.getListaPeliculas()){

                System.out.println(" - " + pelicula.getNombre());
            }
        System.out.println();
        System.out.println();


        for(NodoArbol hijo : actual.getListaNodos()){

            mostrarPreordenRE(hijo);
        }
    }
    public void mostrarPreorden(){
        mostrarPreordenRE(raiz);
    }
}
