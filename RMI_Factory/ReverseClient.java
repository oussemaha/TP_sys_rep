
import java.rmi.registry.*;

public class ReverseClient {
    public static void main(String[] args) {

        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            FabInterface fabrique = (FabInterface) reg.lookup("Fabrique");
            AppInterface ReverseObj1;
            ReverseObj1 = (AppInterface) fabrique.create_app(1);
            AppInterface ReverseObj2;
            ReverseObj2 = (AppInterface) fabrique.create_app(2);
            ReverseObj1.Greetings();
            ReverseObj2.Greetings();
        } catch (Exception e) {
            System.out.println("Erreur d'acces a l'objet distant.");
            e.printStackTrace();
        }
    }
}