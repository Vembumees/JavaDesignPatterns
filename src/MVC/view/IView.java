package MVC.view;

import MVC.model.Employee;

import java.util.List;

public interface IView {
    void showEnrolledEmployees(List<Employee> enrolledEmployees);
}
