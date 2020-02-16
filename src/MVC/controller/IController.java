package MVC.controller;

import MVC.model.Employee;

public interface IController {
    void displayEnrolledEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(String employeeId);
}
