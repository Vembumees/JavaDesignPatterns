package Adapter.Modified;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ADAPTER PATTERN MODIFIED DEMO");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is: " + rectangle.calculateAreaOfRectangle()+" Square unit.");
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of Triangle is : " +triangle.calculateAreaOfTriangle()+ " Square unit.");
        RectInterface adapter = new TriangleAdapter(triangle);
        //passing a triangle instead of a rectangle
        System.out.println("Area of Triangle using the triangle adapter is: " +getArea(adapter)+ "Square unit.");

        //some additional code to show the power of adapter
        List<RectInterface> rectangleObjects = new ArrayList<RectInterface>();
        rectangleObjects.add(rectangle);
        //rectangleObjects.add(triangle); //error
        rectangleObjects.add(adapter); //ok
        System.out.println("");
        System.out.println("Current objects in the system are:");

        for (RectInterface rectObjects : rectangleObjects)
        {
            rectObjects.aboutRectangle();
        }
    }

    static double getArea(RectInterface r)
    {
        return r.calculateAreaOfRectangle();
    }
}
