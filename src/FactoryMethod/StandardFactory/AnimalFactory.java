package FactoryMethod.StandardFactory;

abstract class AnimalFactory {
    /*Remember that the gof definition says "factory method lets a class
    defer instantiation to subclasses." In our case, the following
    method will create a tiger or dog, but at this point it does not know whether
    it will get a Dog or a Tiger. this decision will be taken by the subclasses
    example DogFactory or TigerFactory. So in this implementation, the following
    method is playing the role of a factory
     */
    public abstract Animal createAnimal();

}
