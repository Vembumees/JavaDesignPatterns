package Composite.Example2;

public class Letter extends LetterComposite {
    private char character;

    public Letter(char c){
        this.character = c;
    }

    @Override
    protected void printThisBefore()
    {
        System.out.println(character);
    }
}
