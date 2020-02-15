package State;

public class Mute implements IPossibleState {

    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On button. Going from mute mode to On state.");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. going from mute mode to off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button. TV is already in mute mode.");
    }

    public String toString()
    {
        return "\t TV IS MUTED NOW.";
    }
}
