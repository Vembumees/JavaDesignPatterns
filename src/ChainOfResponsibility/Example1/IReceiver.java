package ChainOfResponsibility.Example1;

public interface IReceiver {
    boolean handleMessage(Message message);
    void nextErrorHandler(IReceiver nextReceiver);
}
