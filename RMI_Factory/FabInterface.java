import java.rmi.Remote;
import java.rmi.RemoteException;

interface FabInterface extends Remote {
    public AppInterface create_app(int id) throws RemoteException;
}
