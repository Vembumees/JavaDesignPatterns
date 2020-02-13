package Adapter.Another;

public class FishingBoatAdapter implements IRowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter(){
        boat = new FishingBoat();
    }


    @Override
    public void row() {
        boat.sail();
    }
}
