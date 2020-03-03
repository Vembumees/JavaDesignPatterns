package Strategy.Example2;

public class DefenceTactic implements FootballStrategy {
    @Override
    public void adhereTactics(String team) {
        System.out.println(team + " will play defensively. ");
    }
}
