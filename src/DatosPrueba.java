public class DatosPrueba {
    public static void cargar(
            SistemaPrincipal sistema
    ) {

//Agregando Categorias
        sistema.getArbol().insertarCategoria("Ciencia Ficcion");
        sistema.getArbol().insertarCategoria("Accion");
        sistema.getArbol().insertarCategoria("Terror");
        sistema.getArbol().insertarCategoria("Fantasia");


//AGREGANDO PELIS

//CIENCIA FICCION
        Pelicula interstellar = new Pelicula(
                "Interstellar",
                "Christopher Nolan",
                "Sci-Fi",
                "Espacial",
                169,
                "Un grupo de astronautas viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad mientras la Tierra enfrenta una crisis global."
        );

        Pelicula inception = new Pelicula(
                "Inception",
                "Christopher Nolan",
                "Sci-Fi",
                "Psicologico",
                148,
                "Un experto en infiltrarse en los sueños recibe la misión de implantar una idea en la mente de un objetivo sin que este lo note."
        );

        Pelicula arrival = new Pelicula(
                "Arrival",
                "Denis Villeneuve",
                "Sci-Fi",
                "Alienigena",
                116,
                "Una lingüista intenta comunicarse con una raza extraterrestre que llega a la Tierra para descubrir el propósito de su visita."
        );

        Pelicula bladeRunner = new Pelicula(
                "Blade Runner 2049",
                "Denis Villeneuve",
                "Sci-Fi",
                "Cyberpunk",
                164,
                "Un cazador de replicantes descubre un secreto que podría cambiar el equilibrio entre humanos y androides."
        );

        Pelicula dune = new Pelicula(
                "Dune",
                "Denis Villeneuve",
                "Sci-Fi",
                "Espacial",
                155,
                "Paul Atreides debe enfrentar conflictos políticos y profecías en el desértico planeta Arrakis, fuente de la sustancia más valiosa del universo."
        );
        sistema.AgregarPelicula("Ciencia Ficcion", interstellar);
        sistema.AgregarPelicula("Ciencia Ficcion", inception);
        sistema.AgregarPelicula("Ciencia Ficcion", arrival);
        sistema.AgregarPelicula("Ciencia Ficcion", bladeRunner);
        sistema.AgregarPelicula("Ciencia Ficcion", dune);

//ACCION
        Pelicula johnWick = new Pelicula(
                "John Wick",
                "Chad Stahelski",
                "Accion",
                "Crimen",
                101,
                "Un exasesino regresa al mundo criminal para vengar la muerte de su perro, el último recuerdo de su esposa."
        );

        Pelicula nobody = new Pelicula(
                "Nobody",
                "Ilya Naishuller",
                "Accion",
                "Crimen",
                92,
                "Un hombre aparentemente común revela habilidades letales cuando su familia es amenazada."
        );

        Pelicula madMax = new Pelicula(
                "Mad Max Fury Road",
                "George Miller",
                "Accion",
                "Postapocaliptico",
                120,
                "En un mundo devastado, Max ayuda a una guerrera a escapar de un tirano mientras son perseguidos por el desierto."
        );
        sistema.AgregarPelicula("Accion", johnWick);
        sistema.AgregarPelicula("Accion", nobody);
        sistema.AgregarPelicula("Accion", madMax);

//TERROR
        Pelicula conjuro = new Pelicula(
                "El Conjuro",
                "James Wan",
                "Terror",
                "Paranormal",
                112,
                "Los investigadores paranormales Ed y Lorraine Warren ayudan a una familia aterrorizada por una presencia maligna."
        );

        Pelicula insidious = new Pelicula(
                "Insidious",
                "James Wan",
                "Terror",
                "Paranormal",
                103,
                "Una familia intenta rescatar a su hijo de una dimensión oscura poblada por entidades sobrenaturales."
        );

        Pelicula hereditario = new Pelicula(
                "Hereditary",
                "Ari Aster",
                "Terror",
                "Psicologico",
                127,
                "Tras la muerte de la abuela, una familia descubre secretos perturbadores que desencadenan eventos aterradores."
        );
        sistema.AgregarPelicula("Terror", conjuro);
        sistema.AgregarPelicula("Terror", insidious);
        sistema.AgregarPelicula("Terror", hereditario);


//FANTASIA
        Pelicula lotr = new Pelicula(
                "El Señor de los Anillos",
                "Peter Jackson",
                "Fantasia",
                "Aventura",
                178,
                "Frodo emprende una peligrosa misión para destruir un anillo capaz de otorgar poder absoluto a las fuerzas del mal."
        );

        Pelicula hobbit = new Pelicula(
                "El Hobbit",
                "Peter Jackson",
                "Fantasia",
                "Aventura",
                169,
                "Bilbo Bolsón acompaña a un grupo de enanos en una aventura para recuperar su reino perdido."
        );

        Pelicula harryPotter = new Pelicula(
                "Harry Potter",
                "Chris Columbus",
                "Fantasia",
                "Magia",
                152,
                "Un joven descubre que es mago y comienza sus estudios en Hogwarts mientras enfrenta amenazas oscuras."
        );
        sistema.AgregarPelicula("Fantasia", lotr);
        sistema.AgregarPelicula("Fantasia", hobbit);
        sistema.AgregarPelicula("Fantasia", harryPotter);

// RELACIONES DEL GRAFO
// Ciencia ficción
        sistema.getGrafo().agregarRelacion(interstellar, inception);
        sistema.getGrafo().agregarRelacion(interstellar, dune);
        sistema.getGrafo().agregarRelacion(dune, arrival);
        sistema.getGrafo().agregarRelacion(dune, bladeRunner);

// Acción
        sistema.getGrafo().agregarRelacion(johnWick, nobody);
        sistema.getGrafo().agregarRelacion(johnWick, madMax);

// Terror
        sistema.getGrafo().agregarRelacion(conjuro, insidious);
        sistema.getGrafo().agregarRelacion(insidious, hereditario);

// Fantasía
        sistema.getGrafo().agregarRelacion(lotr, hobbit);
        sistema.getGrafo().agregarRelacion(hobbit, harryPotter);
        {
        }
    }
}
