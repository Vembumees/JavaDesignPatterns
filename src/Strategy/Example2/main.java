package Strategy.Example2;

public class main {
    public static void main(String[] args) {
        String team1 = "Barcelona";
        String team2 = "Real Madrid";
        TacticContext context = new TacticContext();
        context.setStrategy(new AttackTactic());
        context.selectTactic(team1);

        context.setStrategy(new DefenceTactic());
        context.selectTactic(team2);
    }
}
