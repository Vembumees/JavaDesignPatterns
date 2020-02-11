package Builder.Standard;

import java.util.LinkedList;

public class Product {

    //you can use any data structure that you prefer,
    //I have used LinkedList<String> in this case.

    private LinkedList<String> parts;

    public Product()
    {
        parts = new LinkedList<String>();
    }

    public void add(String part)
    {
        //adding parts
        parts.addLast(part);
    }

    public void showProduct()
    {
        System.out.println("\nProduct completed as below :");
        for (String part : parts)
        {
            System.out.println(part);
        }
    }
}
