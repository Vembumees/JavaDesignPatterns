package Proxy.modifiedImplementation;

public class Main {

    public static void main(String[] args) {
        System.out.println("PROXY PATTERN DEMO");
        //admin is an authorized user
        ModifiedProxy px1 = new ModifiedProxy("Admin");
        px1.doSomeWork();
        //Bay is an unauthorized user
        ModifiedProxy px2 = new ModifiedProxy("Timo");
        px2.doSomeWork();

    }
}
