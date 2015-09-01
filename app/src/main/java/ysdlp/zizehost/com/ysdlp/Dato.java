package ysdlp.zizehost.com.ysdlp;

/**
 * POJO de una noticia
 */
public class Dato {

    private String nombre;
    private String descripcion;
    private String fecha;
    private float rating;
    private int idThumbnail;

    public Dato(String nombre, String descripcion, String fecha, float rating, int idThumbnail) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.rating = rating;
        this.idThumbnail = idThumbnail;
    }

    public Dato() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public float getRating() {
        return rating;
    }

    public int getIdThumbnail() {
        return idThumbnail;
    }
}
