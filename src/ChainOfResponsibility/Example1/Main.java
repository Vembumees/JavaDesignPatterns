package ChainOfResponsibility.Example1;

public class Main {

    public static void main(String[] args) {
        System.out.println("CHAIN OF RESPONSIBILITY");

        IReceiver faxHandler, emailHandler;

        //objcets of the chains
        IssueRaiser issueRaiser = new IssueRaiser();
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();
        issueRaiser.setFirstErrorhandler(faxHandler);
        faxHandler.nextErrorHandler(emailHandler);
        emailHandler.nextErrorHandler(null);

        Message m1 = new Message("Fax is going slow.", EMessagePriority.NORMAL);
        Message m2 = new Message("Emails are not reaching.", EMessagePriority.HIGH);
        Message m3 = new Message("In Email, CC field is disabled always.", EMessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destinations.", EMessagePriority.HIGH);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);
    }
}
