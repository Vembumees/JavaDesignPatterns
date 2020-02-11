package FactoryMethod.ModifiedFactory;


abstract class AnimalFactory {
    public Animal makeAnimal()
    {
        System.out.println("I'm inside makeAnimal() of AnimalFactory. You can't ignore my rules.");
        /*at this point, it doesn't know whether it will get dog or
        a tiger, it will be decided by the subclasses ie dogfactory or tigerfactory, but it
        knows that it will speak and it will have a preferred way of action.*/
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }


    public abstract Animal createAnimal();
}
