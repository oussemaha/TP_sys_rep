import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

class AppImpl extends UnicastRemoteObject implements AppInterface{
    private int id;

    public AppImpl(int id)throws RemoteException {
        super();
        this.id=id;
    }
    @Override
    public void Greetings()throws RemoteException{
        System.out.printf("hi from app num %d",id);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

}