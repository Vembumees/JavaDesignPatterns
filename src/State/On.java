package State;

public class On implements IPossibleState {
    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On. TV is already in On state.");
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from On to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button. Going from On to Mute mode.");
        context.setCurrentState(new Mute());
        System.out.println(context.getCurrentState().toString());
    }

    public String toString()
    {
        return "\t TV IS SWITCHED ON NOW";
    }
}
