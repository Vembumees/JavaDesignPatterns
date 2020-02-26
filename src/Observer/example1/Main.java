package Observer.example1;

public class Main {

    public static void main(String[] args) {
        System.out.println("OBSERVER PATTERN DEMO");
        //we have 3 observers, 2 observertype1 and 1 observertype2
        IObserver myObserver1 = new ObserverType1("Roy");
        IObserver myObserver2 = new ObserverType1("Kevin");
        IObserver myObserver3 = new ObserverType2("Michael");
        Subject subject = new Subject();

        subject.register(myObserver1);
        subject.register(myObserver2);
        subject.register(myObserver3);
        System.out.println(" Setting Flag = 5 ");
        subject.setFlag(5);
        //unregistering an observer(Roy)
        subject.unregister(myObserver1);
        System.out.println("\n Setting Flag = 50 ");
        subject.setFlag(50);
        //roy is registering himself again
        subject.register(myObserver1);
        System.out.println("\n Setting Flag = 100");
        subject.setFlag(100);
    }
}
