package State.Example2;

public class Winter implements Season {
    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("Winter is now...");
        context.setNextSeason(new Spring());
    }
}
