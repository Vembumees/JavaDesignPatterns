package Bridge.Example1;

abstract class ElectronicGoods {

    //Composition - implementor
    protected IState state;
    //alternative approach:
    //We can also pass an implementor inside a constructor
    /*
    public ElectronicGoods(IState state)
    {
        this.state = state;
    }
     */

    public IState getState()
    {
        return state;
    }

    public void setState(IState state)
    {
        this.state = state;
    }

public void moveToCurrentState()
{
    System.out.println("The electronic item is functioning at : ");
    state.moveState();
}

public void hardButtonPressed()
{
    state.hardPressed();
}


}
