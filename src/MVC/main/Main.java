package MVC.main;

import MVC.controller.EmployeeController;
import MVC.controller.IController;
import MVC.model.Employee;
import MVC.model.EmployeeModel;
import MVC.model.IModel;
import MVC.view.ConsoleView;
import MVC.view.IView;

public class Main {

    public static void main(String[] args) {
        System.out.println("MVC\n");

        IModel model = new EmployeeModel();

        IView view = new ConsoleView();

        IController controller = new EmployeeController(model, view);
        controller.displayEnrolledEmployees();

        controller.addEmployee(new Employee("Kevin","E4"));
        controller.displayEnrolledEmployees();

        controller.removeEmployee("E2");
        controller.displayEnrolledEmployees();

        controller.removeEmployee("E5");
        controller.displayEnrolledEmployees();

        controller.addEmployee(new Employee("Kevin","E4"));
    }
}
