package State.Example2;

public class Summer implements Season {
    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("Summer is now...");
        context.setNextSeason(new Autumn());
    }
}
