package Prototype.prototype;

public class Nano extends BasicCar{

    //base price for Nano
    public int basePrice = 100000;
    public Nano(String m)
    {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
        return (Nano)super.clone();
    }
}
