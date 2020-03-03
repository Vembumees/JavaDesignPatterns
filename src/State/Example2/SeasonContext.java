package State.Example2;

public class SeasonContext {
    private Season season;

    public SeasonContext() {
        this.season = new Winter();
    }

    public Season getSeason() {
        return season;
    }

    public void setNextSeason(Season season) {
        this.season = season;
    }

    public void currentSeason(){
        season.theSeason(this);
    }
}
