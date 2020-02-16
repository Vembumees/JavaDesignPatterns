package SimpleFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("SIMPLE FACTORY");
        IAnimal preferredType = null;
        SimpleFactory simpleFactory = new SimpleFactory();
        preferredType = simpleFactory.createAnimal();
        preferredType.speak();
    }
}
