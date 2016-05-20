import java.rmi.*;

// Extend user-define interface with Remote interface to make it a remote object
public interface demo_inter extends Remote
{
	public int cal(String s)throws RemoteException;
}
