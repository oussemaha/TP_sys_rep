import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabImpl extends UnicastRemoteObject implements FabInterface {
    FabImpl() throws RemoteException {  
        super();
     System.out.println("Fabrique created");
     
    }
    @Override
    public AppInterface create_app(int id) throws RemoteException{
        System.out.println("Instance créée");
        return new AppImpl(id);
    }
}
