import java.rmi.Remote;
import java.rmi.RemoteException;
interface AppInterface extends Remote{
    public void Greetings() throws RemoteException;
}