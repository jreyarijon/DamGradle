import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ElTiempo {
    public static void main(String[] args) throws IOException {
        /* System.out.println("Hello");
        Document doc = Jsoup.connect("http://www.google.com").userAgent("Mozilla").get();
        Element miElemento = doc.select("a").first();
        String  miTexto = miElemento.text();
        System.out.println(miTexto); */

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Chrome").get();

    }
}
