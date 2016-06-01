import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class Square extends UnicastRemoteObject implements SquareOne {

	Square() throws RemoteException{}
	
	public long sqaure(int x) throws RemoteException{
		return x*x;
		}
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		System.setSecurityManager(new RMISecurityManager());
		
		try {
			Square s = new Square();
			Naming.bind("rmi://localhost/Square",s);
			System.out.println("Computing Squares");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public long square(int i) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
