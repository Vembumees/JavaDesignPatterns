package Builder.Another;

public enum HairType {

    BALD("Bald"),
    SHORT("Short"),
    CURLY("Curly"),
    LONG_STRAIGHT("Long straight"),
    LONG_CURLY("Long curly");

    private final String title;

    HairType(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}
