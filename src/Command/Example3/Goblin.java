package Command.Example3;

public class Goblin extends Target{
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString()
    {
        return "Goblin";
    }
}
