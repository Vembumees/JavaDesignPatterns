package State.Example2;

public class Spring implements Season {
    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("Sprint is now...");
        context.setNextSeason(new Summer());
    }
}
