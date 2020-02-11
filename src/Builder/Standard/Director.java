package Builder.Standard;

public class Director {
    Builder builder;
    //director knows how to use the builder and the
    //sequence of steps.
    public void construct(Builder builder)
    {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
        builder.endOperations();
    }
}
