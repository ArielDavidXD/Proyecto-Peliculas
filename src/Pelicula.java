public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private String subgenero;
    private int duracion;
    private String sinopsis;

    private boolean vista;

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public Pelicula(String nombre, String director, String genero, String subgenero, int duracion, String sinopsis) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.subgenero = subgenero;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.vista =false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
