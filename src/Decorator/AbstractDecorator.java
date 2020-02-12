package Decorator;

public class AbstractDecorator extends Component {

    protected Component component;

    public void setTheComponent(Component c)
    {
        component = c;
    }

    @Override
    public void makeHouse() {
       if (component != null)
       {
           //delegating the task
           component.makeHouse();
       }
    }
}
