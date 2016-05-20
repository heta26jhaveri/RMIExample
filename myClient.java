import java.rmi.*;

public class myClient {

	public static void main(String s[]) {
	try{
		// get the reference of the remote object by 
		// calling lookup in the registry with name temp at localhost, port number 5000
		demo_inter obj =(demo_inter) Naming.lookup("rmi://localhost:5000/temp");

		// call the method on the remote object.
		System.out.print(obj.cal("Hello"));	
	}
	catch(Exception e){
		System.out.print("Oops Exception: "+e.toString());	
	}

	}
}