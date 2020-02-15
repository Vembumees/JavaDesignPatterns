package State;

public class Off implements IPossibleState {

    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On. Going from Off to On");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("you pressed Off button. TV is already in Off state");
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed mute button. TV is already in off state.");
    }

    public String toString()
    {
        return "\t TV IS SWITCHED OFF NOW.";
    }
}
