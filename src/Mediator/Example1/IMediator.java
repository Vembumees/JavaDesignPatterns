package Mediator.Example1;

public interface IMediator {
    void register(Employee employee);
    void sendMessage(Employee employee, String msg) throws InterruptedException;
}
