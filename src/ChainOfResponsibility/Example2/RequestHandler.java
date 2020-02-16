package ChainOfResponsibility.Example2;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req){
        if (next != null){
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req){
        System.out.println(this.toString() + " handling request" + req.toString());
    }

    @Override
    public abstract String toString();
}
