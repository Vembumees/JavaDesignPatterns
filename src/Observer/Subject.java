package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubjectInterface {

    private int flag;
    public int getFlag()
    {
        return flag;
    }
    public void setFlag(int flag)
    {
        this.flag = flag;
        //flag value changed. so notify registered users/observers
        notifyRegisteredUsers(flag);
    }

    List<IObserver> observerList = new ArrayList<IObserver>();

    @Override
    public void register(IObserver anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(IObserver anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notifyRegisteredUsers(int updatedValue) {
        for (IObserver observer : observerList)
        {
            observer.update(updatedValue);
        }
    }
}
