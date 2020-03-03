package Strategy.Example2;

public class AttackTactic implements FootballStrategy {
    @Override
    public void adhereTactics(String team) {
        System.out.println(team + " will play more offensively!");
    }
}
