package Builder.Another;

public enum Armor {
    CLOTHES("Clothes"),
    LEATHER("Leather"),
    CHAIN_MAIL("Chain mail"),
    PLATE_MAIL("Plate mail");

    private final String title;

    Armor(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}