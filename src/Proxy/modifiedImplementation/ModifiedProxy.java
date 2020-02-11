package Proxy.modifiedImplementation;

import java.util.ArrayList;
import java.util.List;

public class ModifiedProxy extends Subject {

    static Subject cs;
    String currentUser;
    List<String> registeredUsers;

    //Or, simply create this mutable list in one step
        /*List<String> registeredUsers=new ArrayList<String>(Arrays.asList(
        "Admin","Rohit","Sam"));*/

    public ModifiedProxy(String currentUser){
        //registered users are admin, Michael and Bay only
        registeredUsers = new ArrayList<String>();
        registeredUsers.add("Admin");
        registeredUsers.add("Michael");
        registeredUsers.add("Bay");
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now...");
        System.out.println(currentUser + " wants to invoke a proxy method.");
        if (registeredUsers.contains(currentUser))
        {
            //lazy initialization: we'll not instantiate until the method is called
            if (cs == null)
            {
                cs = new ConcreteSubject();
            }
            //allow the registered users to invoke the method
            cs.doSomeWork();
        }
        else
        {
            System.out.println("Sorry " + currentUser + ", you do not have access rights.");
        }
    }
}
