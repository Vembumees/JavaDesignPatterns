package Builder.Example5;

public class main {
    public static void main(String[] args) {
        UnitBuilder builder = new ZealotBuilder();
        Gateway director = new Gateway();
        Unit product = director.constructUnit(builder);
        System.out.println(product);
    }
}
