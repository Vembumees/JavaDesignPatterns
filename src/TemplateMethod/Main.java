package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEMPLATE METHOD PATTERNS");
        BasicEngineering preferredCourse = new ComputerScience();
        System.out.println("Computer sc. course will be completed in the followign order:");
        preferredCourse.completeCourse();
        System.out.println();
        preferredCourse = new Electronics();
        System.out.println("Electronics course will be completed in the following order:");
        preferredCourse.completeCourse();
    }
}
