package MVC.controller;

import MVC.model.Employee;
import MVC.model.IModel;
import MVC.view.IView;

import java.util.List;

public class EmployeeController implements IController
{
    private IModel model;
    private IView view;
    public EmployeeController(IModel model, IView view)
    {
        this.model = model;
        this.view = view;
    }
    @Override
    public void displayEnrolledEmployees()
    {
        //Get data from Model
        List<Employee> enrolledEmployees = model.getEnrolledEmployeeDetailsFromModel();
        //Connect to View
        view.showEnrolledEmployees(enrolledEmployees);
    }
    //Sending a request to model to add an employee to the list.
    @Override
    public void addEmployee(Employee employee)
    {
        model.addEmployeeToModel(employee);
    }
    //Sending a request to model to remove an employee from the list.
    @Override
    public void removeEmployee(String employeeId)
    {
        model.removeEmployeeFromModel(employeeId);
    }
}
