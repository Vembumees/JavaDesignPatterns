package ChainOfResponsibility;

public class IssueRaiser {
    public IReceiver setFirstReceiver;
    public void setFirstErrorhandler(IReceiver firstErrorHandler)
    {
        this.setFirstReceiver = firstErrorHandler;
    }
    public void raiseMessage(Message message)
    {
        if (setFirstReceiver != null);
        setFirstReceiver.handleMessage(message);
    }
}
