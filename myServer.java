import java.rmi.*;
import java.rmi.registry.*;

public class myServer{
	public static void main(String a[]){
	try{
		// get the reference of remote object
		demo_remote ob=new demo_remote();

		// bind the remote object in the registry at localhost, port number 5000 
		// with the name temp
		Naming.bind("rmi://localhost:5000/temp",ob);
	}
	catch(Exception e){
		System.out.println("Oops Exception: "+e.toString());
	}
	}
}