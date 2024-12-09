import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class JWS {
    public static void main (String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("webservice deployé dans [http://0.0.0.0:9191]");
    }
}
