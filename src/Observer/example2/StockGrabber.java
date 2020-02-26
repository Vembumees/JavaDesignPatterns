package Observer.example2;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double IbmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex++) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update(IbmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double newIBMPrice){
        this.IbmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGOOGprice){
        this.googPrice = newGOOGprice;
        notifyObserver();
    }
}
