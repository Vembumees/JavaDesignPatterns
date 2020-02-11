package Proxy.simple;

public class Proxy extends Subject {

    static Subject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening right now...");
        //lazy init: we'll not instantiate until the method is called
        if (cs == null)
        {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
