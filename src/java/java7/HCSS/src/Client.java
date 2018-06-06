
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client 
{
    
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter server name");
        String serverName=sc.next();
        System.out.println("enter port no");
        int portNo=sc.nextInt();
        System.out.println("enter userid");
        String uesrId=sc.next();
        String password=sc.next();

Registry reg=LocateRegistry.getRegistry(serverName,portNo);
        
        LoginInterface li=(LoginInterface)reg.lookup("AUTH");
        
        boolean result=li.check(uesrId, password);
        if(result)
        {
                System.out.println("welcome");
        }
        else
        {
                System.out.println("invalid id/password");
        }
        
}
    
}
