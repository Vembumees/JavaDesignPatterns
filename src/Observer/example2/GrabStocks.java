package Observer.example2;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(200.00);
        stockGrabber.setAaplPrice(600.00);
        stockGrabber.setGoogPrice(800.00);


        stockGrabber.setIbmPrice(220.00);
        stockGrabber.setAaplPrice(620.00);
        stockGrabber.setGoogPrice(820.00);

        stockGrabber.unregister(observer1);

        stockGrabber.setGoogPrice(830);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 678.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 890.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
