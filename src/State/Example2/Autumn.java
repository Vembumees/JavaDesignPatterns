package State.Example2;

public class Autumn implements Season {
    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("Autumn is now...");
        context.setNextSeason(new Winter());
    }
}
