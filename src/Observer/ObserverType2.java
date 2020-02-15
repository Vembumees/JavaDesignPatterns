package Observer;

public class ObserverType2 implements IObserver {
    String nameOfObserver;
    public ObserverType2(String name)
    {
        this.nameOfObserver = name;
    }


    @Override
    public void update(int updatedValue) {
        System.out.printf(nameOfObserver + " had received an alert: The current value of myValue in Subject is: " +  updatedValue);
    }
}
