
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class serveur {
    public static void main(String[] args) {
        try {
            CalculatriceImpl calculatrice = new CalculatriceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("calculatrice", calculatrice);
            System.out.println("Serveur prêt !");
        } catch (Exception e) {
            System.err.println("Erreur sur le serveur : " + e.getMessage());
        }
    }
}
