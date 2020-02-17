package DoubleCheckedLocking;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final var inventory = new Inventory(1000000);
        var executorservice = Executors.newFixedThreadPool(3);
        IntStream.range(0, 3).<Runnable>mapToObj(i -> () -> {
            while (inventory.addItem(new Item())){
                System.out.println("Adding another item.");
            }
        }).forEach(executorservice::execute);

        executorservice.shutdown();
        try {
            executorservice.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e){
            System.out.println("Error waiting for executorService shutdown.");
        }
    }
}
