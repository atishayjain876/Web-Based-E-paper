
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;




public class CheckLogin  extends UnicastRemoteObject implements  LoginInterface
{
    
    public CheckLogin()throws RemoteException
    {
        
    }
    
@Override
    public boolean check(String userId, String password) throws RemoteException 
    {
        
        
   if(userId.equals("bhookh") && password.equals("kachori"))
    return true;
else
    return false;
    }


    
}
