package Builder.Standard;

public class Car implements Builder {

    private String brandName;
    private Product product;

    public Car(String brand)
    {
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperations() {
        //starting with brand name
        product.add(String.format("Car model is: %s", this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Car.");
    }


    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 Headlights are added");
    }

    @Override
    public void endOperations() {
        //nothing in this case
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
