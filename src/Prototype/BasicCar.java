package Prototype;

import java.util.Random;

public class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice, onRoadPrice;

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public static int setAdditionalPrice(){
        int price = 0;
        Random r = new Random();
        //we'll get an integer value in the range 0-10000
        int p = r.nextInt(10000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException
    {
        return (BasicCar)super.clone();
    }
}
