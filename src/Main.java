import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=== \uD83C\uDFAC MOVIE CONNECT ===");
        Scanner sc = new Scanner(System.in);
        SistemaPrincipal sistema = new SistemaPrincipal();
        DatosPrueba.cargar(sistema);


        int opcion;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1-Buscar Pelicula");
            System.out.println("2-Ver Wishlist");
            System.out.println("3-Ver Historial");
            System.out.println("4-Mostrar Todas las Pelis");
            System.out.println("0-Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println(
                            "Ingrese nombre de pelicula:"
                    );

                    String nombre =
                            sc.nextLine();

                    Pelicula pelicula =
                            sistema.buscarPelicula(
                                    nombre
                            );

                    if (pelicula == null) {

                        System.out.println(
                                "Pelicula no encontrada"
                        );

                        break;
                    }

                    System.out.println(
                            "\nPelicula encontrada:"
                    );

                    System.out.println(
                            pelicula.getNombre()
                    );

                    System.out.println(
                            pelicula.getDirector()
                    );

                    System.out.println(
                            pelicula.getGenero()
                    );
                    System.out.println(pelicula.getSinopsis());

                    int opcionPeli;

                    do {

                        System.out.println(
                                "\n=== OPCIONES ==="
                        );

                        System.out.println(
                                "1-Ver pelicula"
                        );

                        System.out.println(
                                "2-Ver recomendaciones"
                        );

                        System.out.println(
                                "3-Ver peliculas del director"
                        );

                        System.out.println(
                                "4-Agregar a wishlist"
                        );

                        System.out.println(
                                "5-Volver"
                        );

                        opcionPeli =
                                sc.nextInt();

                        switch (opcionPeli) {

                            case 1:

                                sistema.verPelicula(
                                        pelicula.getNombre()
                                );

                                break;

                            case 2:

                                List<Pelicula> recomendaciones =
                                        sistema.recomendar(
                                                pelicula.getNombre()
                                        );

                                System.out.println(
                                        "\nRECOMENDACIONES:"
                                );

                                for (Pelicula p : recomendaciones) {

                                    System.out.println(
                                            p.getNombre()
                                    );
                                }

                                break;

                            case 3:

                                sistema.explorarDirector(
                                        pelicula.getNombre()
                                );

                                System.out.println();

                                break;

                            case 4:


                                sistema.agregarWishlist(
                                        pelicula.getNombre()
                                );



                                break;

                            case 5:

                                break;

                            default:

                                System.out.println(
                                        "Opcion invalida"
                                );
                        }

                    } while (opcionPeli != 5);

                    break;

                case 2:

                    sistema.mostrarWishlist();

                    break;

                case 3:

                    sistema.mostrarHistorial();

                    break;

                case 4:
                    sistema.getArbol().mostrarPreorden();
                    break;

                case 0:

                    System.out.println(
                            "Saliendo..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opcion invalida"
                    );
            }

        } while (opcion != 0);

        sc.close();
    }
}