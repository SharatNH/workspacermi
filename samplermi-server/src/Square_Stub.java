// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class Square_Stub
    extends java.rmi.server.RemoteStub
    implements SquareOne, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_square_0;
    
    static {
	try {
	    $method_square_0 = SquareOne.class.getMethod("square", new java.lang.Class[] {int.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public Square_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of square(int)
    public long square(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_square_0, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, -2654517703563335185L);
	    return ((java.lang.Long) $result).longValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
