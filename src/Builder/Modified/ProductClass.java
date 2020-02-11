package Builder.Modified;

final class ProductClass {
    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadlights;
    private String endOperationsMessage;

    public ProductClass(final String startUpMessage, String bodyType,
                        int noOfWheels, int noOfHeadlights, String endOperationsMessage){
        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadlights = noOfHeadlights;
        this.endOperationsMessage = endOperationsMessage;
    }

    /*there are no setter methods used here to promote immutability. Since the
    attirubtes are private and there is no setter methods, the keyword
    final is not needed to attach with the attributes.
     */

    @Override
    public String toString()
    {
        return "Product Completed as:\n startupMessage=" +
                startUpMessage + "\n bodyType=" + bodyType +
                "\n noOfWheels=" + noOfWheels +
                "\n noOfHeadlights=" + noOfHeadlights +
                "\n endOperationMessage=" + endOperationsMessage;
    }
}
