package Builder.Standard;

public class MotorCycle implements Builder {

    private String brandName;
    private Product product;

    public MotorCycle(String brandName)
    {
        product = new Product();
        this.brandName = brandName;
    }

    @Override
    public void startUpOperations() {
        //nothing in this case
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle.");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added.");
    }

    @Override
    public void addHeadLights() {
        product.add("1 Headlights are added.");
    }

    @Override
    public void endOperations() {
        //finishing up with brand name
        product.add(String.format("Motorcycle model is: %s.", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
