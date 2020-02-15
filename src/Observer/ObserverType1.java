package Observer;

public class ObserverType1 implements IObserver {

    String nameOfObserver;
    public ObserverType1(String name)
    {
        this.nameOfObserver = name;
    }


    @Override
    public void update(int updatedValue) {
        System.out.println(nameOfObserver + " has receives an alert: Updated " +
                "myValue in Subject is: " + updatedValue);
    }
}
