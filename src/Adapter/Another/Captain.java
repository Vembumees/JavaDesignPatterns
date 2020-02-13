package Adapter.Another;

public final class Captain {

    private IRowingBoat rowingBoat;

    public Captain(){

    }

    public Captain(final IRowingBoat boat){
        this.rowingBoat = boat;
    }

    void setRowingBoat(final IRowingBoat boat){
        this.rowingBoat = boat;
    }

    public void row() {
        rowingBoat.row();
    }
}
