import java.rmi.*;

public class demo_remote extends UnicastRemoteObject implements demo_inter{
	demo_remote() throws RemoteException{
		super();
	}

	// simple method to calculate length of the String s and return it.
	public int cal(String s){		
		int l=s.length();
		return l;
	}
}