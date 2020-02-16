package ChainOfResponsibility;

public class Message {
    public String text;
    public EMessagePriority priority;
    public Message(String msg, EMessagePriority p)
    {
        text = msg;
        this.priority = p;
    }
}
