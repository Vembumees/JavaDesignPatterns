package Strategy.Example2;

public class TacticContext {
    private FootballStrategy strategy = null;

    public void selectTactic(String team){
        strategy.adhereTactics(team);
    }

    public FootballStrategy getStrategy(){
        return strategy;
    }

    public void setStrategy(FootballStrategy strategy){
        this.strategy = strategy;
    }
}
