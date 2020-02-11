package Builder.Standard;

interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadLights();
    void endOperations();
    //the following method is used to retrieve the object that is constructed
    Product getVehicle();
}
