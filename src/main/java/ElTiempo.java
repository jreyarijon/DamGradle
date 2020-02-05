import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ElTiempo {
    public static void main(String[] args) throws IOException {
        /* System.out.println("Hello");
        Document doc = Jsoup.connect("http://www.google.com").userAgent("Mozilla").get();
        Element miElemento = doc.select("a").first();
        String  miTexto = miElemento.text();
        System.out.println(miTexto); */

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();

        Elements miElemento = doc.getElementsByClass("today_nowcard-temp");
        Elements miElemento1 = doc.getElementsByClass("today_nowcard-phrase");
        String titulo = doc.title();
        String miTexto = miElemento.text();
        String miTexto1 = miElemento1.text();
        String miTexto2 = titulo;
        System.out.println("Hoy está "+miTexto1 +"y hace "+miTexto+" grados. Datos extraídos de Vigo, España Pronóstico del tiempo y condiciones meteorológicas "+miTexto2);

    }
}
