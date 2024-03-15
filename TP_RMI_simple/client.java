import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            CalculatriceInterface calculatrice = (CalculatriceInterface) registry.lookup("calculatrice");
            System.out.println("Client connecté au serveur.");

            Scanner scanner = new Scanner(System.in);
            boolean continuer = true;
            while (continuer) {
                System.out.println("Choisissez une opération:");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Quitter");
                System.out.print("Votre choix : ");
                int choix = scanner.nextInt();

                double a, b;
                switch (choix) {
                    case 1:
                        System.out.print("Entrez le premier nombre : ");
                        a = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre : ");
                        b = scanner.nextDouble();
                        System.out.println("Résultat : " + calculatrice.addition(a, b));
                        break;
                    case 2:
                        System.out.print("Entrez le premier nombre : ");
                        a = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre : ");
                        b = scanner.nextDouble();
                        System.out.println("Résultat : " + calculatrice.soustraction(a, b));
                        break;
                    case 3:
                        System.out.print("Entrez le premier nombre : ");
                        a = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre : ");
                        b = scanner.nextDouble();
                        System.out.println("Résultat : " + calculatrice.multiplication(a, b));
                        break;
                    case 4:
                        System.out.print("Entrez le premier nombre : ");
                        a = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre : ");
                        b = scanner.nextDouble();
                        System.out.println("Résultat : " + calculatrice.division(a, b));
                        break;
                    case 5:
                        continuer = false;
                        break;
                    default:
                        System.out.println("Choix invalide !");
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur sur le client : " + e.getMessage());
        }
    }
}
