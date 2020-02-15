package IteratorPattern.Simple;

public class Main {
    public static void main(String[] args) {
        System.out.println("ITERATOR PATTERN DEMO");
        ISubjects artsSubjects = new Arts();
        IIterator iteratorForArts = artsSubjects.createIterator();
        System.out.println("\n Arts subjects are as follows:");
        while(iteratorForArts.hasNext())
        {
            System.out.println(iteratorForArts.next());
        }
        iteratorForArts.first();
        System.out.println("Currently pointing back to: " + iteratorForArts.currentItem());
    }
}
