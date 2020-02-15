package IteratorPattern.Simple;

public interface IIterator {
    void first(); //reset to first element
    String next();
    String currentItem();
    boolean hasNext();
}
