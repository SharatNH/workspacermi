import java.rmi.*;
import java.rmi.registry.*;

public class SquareClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setSecurityManager(new RMISecurityManager());
	    try{
	    	SquareOne t = (SquareOne)Naming.lookup("//localhost/Square");
	    	for(int i=0 ; i< 10;i ++)
	    		 System.out.println("Square"+"("+i+")="+t.square(i));
	    	
	    }catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	}

}
