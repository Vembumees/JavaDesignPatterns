package State.Example1;

public class TV {
    private IPossibleState currentState;
    public TV()
    {
        this.setCurrentState(new Off());
    }
    public IPossibleState getCurrentState()
    {
        return currentState;
    }
    public void setCurrentState(IPossibleState currentState)
    {
        this.currentState = currentState;
    }

    public void pressOffButton()
    {
        currentState.pressOffButton(this);
    }
    public void pressOnButton()
    {
        currentState.pressOnButton(this);
    }

    public void pressMuteButton()
    {
        currentState.pressMuteButton(this);
    }
}
