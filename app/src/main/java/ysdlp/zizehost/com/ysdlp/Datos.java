package ysdlp.zizehost.com.ysdlp;

public class Datos {

    private static Dato[] noticias = {
            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),
            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),
            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),
            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),
            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),

            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp),


            new Dato(
                    "TITULO NOTICIA",
                    "Pequeña descripcion",
                    "Fecha",
                    2.8f,
                    R.drawable.ic_alarm_black_24dp)

    };

    private static Dato[] eventos = {
            new Dato(
                    "CONEA 2015 - UNPRG",
                    "---",
                    "26 al 31 de Octubre",
                    5f,
                    R.drawable.ic_alarm_black_24dp),

            new Dato(
                    "CONENI 2015 - UNPRG",
                    "---",
                    "07 al 10 de Octubre",
                    5f,
                    R.drawable.ic_alarm_black_24dp)
    };

    private static Dato[] buscame = {
            new Dato(
                    "Examen de Matematica Aplicada",
                    "---",
                    "09 de Septiembre",
                    5f,
                    R.drawable.ic_alarm_black_24dp),

            new Dato(
                    "Presentar trabajo de gestion",
                    "Gaming",
                    "04 de Octubre",
                    4f,
                    R.drawable.ic_alarm_black_24dp)
    };

    public static Dato[] getNoticias() {
        return noticias;
    }

    public static Dato[] getEventos() {
    return eventos;
    }

    public static Dato[] getBuscame() {
        return buscame;
    }

}
