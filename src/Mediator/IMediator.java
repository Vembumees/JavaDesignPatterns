package Mediator;

public interface IMediator {
    void register(Employee employee);
    void sendMessage(Employee employee, String msg) throws InterruptedException;
}
