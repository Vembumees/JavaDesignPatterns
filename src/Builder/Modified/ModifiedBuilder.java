package Builder.Modified;

interface ModifiedBuilder {
    /*All these methods return type is ModifiedBuilder,
    * this will help us to apply method chaining*/

    ModifiedBuilder startUpOperations(String startUpMessage);
    ModifiedBuilder buildBody(String bodyType);
    ModifiedBuilder insertWheels(int noOfWheels);
    ModifiedBuilder addHeadlights(int noOfHeadlights);
    ModifiedBuilder endOperations(String endOperationsMessage);

    //combine the parts and make the final product
    ProductClass constructCar();
    //optional: to get the already constructed method
    ProductClass getConstructedCar();

}
