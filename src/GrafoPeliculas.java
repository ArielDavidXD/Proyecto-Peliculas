import java.util.*;

public class GrafoPeliculas {
    private Map<Pelicula, List<Pelicula>> grafo;

    public GrafoPeliculas() {
        grafo = new HashMap<>();
    }

    public void agregarPelicula(Pelicula info){
        grafo.putIfAbsent(info, new ArrayList<>());
    }

    public void agregarRelacion(Pelicula origen, Pelicula destino
    ) {
        // Verifica que existan en el grafo
        if (grafo.containsKey(origen)
                && grafo.containsKey(destino)) {

            grafo.get(origen).add(destino);

        } else {

            System.out.println(
                    "Una de las peliculas no existe"
            );
        }
    }

    public void mostrarGrafo(){

        for(Pelicula peliculas : grafo.keySet()){
            System.out.print(peliculas.getNombre() + " -> ");

            List<Pelicula> relaciones = grafo.get(peliculas);

            for (Pelicula relacionadas : relaciones){
                System.out.print(relacionadas.getNombre() + "");
            }
            System.out.println();
        }
    }

    public List<Pelicula> obtenerRecomendaciones(
            Pelicula inicio
    ){

        List<Pelicula> recomendaciones =
                new ArrayList<>();

        Set<Pelicula> visitados =
                new HashSet<>();

        Queue<Pelicula> cola =
                new LinkedList<>();

        visitados.add(inicio);
        cola.add(inicio);

        while(!cola.isEmpty()){

            Pelicula actual =
                    cola.poll();

            List<Pelicula> vecinos =
                    grafo.get(actual);

            for(Pelicula vecina : vecinos){

                if(!visitados.contains(vecina)){

                    visitados.add(vecina);

                    recomendaciones.add(vecina);

                    cola.add(vecina);
                }
            }
        }

        return recomendaciones;
    }
    public Pelicula buscarPeli(String nombre){
        for(Pelicula n: grafo.keySet() ){
            if(n.getNombre().equalsIgnoreCase(nombre)){
                return n;
            }
        }
        return null;
    }
    private void dfsDirector(
            Pelicula actual,
            String director,
            Set<Pelicula> visitados
    ){

        if(actual == null ||
                visitados.contains(actual)){
            return;
        }

        visitados.add(actual);

        if(actual.getDirector()
                .equalsIgnoreCase(director)){

            System.out.println(
                    actual.getNombre()
            );
        }

        for(Pelicula pelicula : grafo.keySet()){

            if(!visitados.contains(pelicula)){

                dfsDirector(
                        pelicula,
                        director,
                        visitados
                );
            }
        }
    }
    public void explorarDirector(String nombrePelicula){

        Pelicula inicio = buscarPeli(nombrePelicula);

        if(inicio == null){
            return;
        }

        Set<Pelicula> visitados = new HashSet<>();

        System.out.println(
                "Peliculas de "
                        + inicio.getDirector()
        );

        dfsDirector(
                inicio,
                inicio.getDirector(),
                visitados
        );
    }






}
