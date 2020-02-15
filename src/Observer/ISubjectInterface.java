package Observer;

public interface ISubjectInterface {
    void register(IObserver anObserver);
    void unregister(IObserver anObserver);
    void notifyRegisteredUsers(int notifiedValue);
}
