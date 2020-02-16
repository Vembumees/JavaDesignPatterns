package MVC.model;

import java.util.List;

public interface IModel {
    List<Employee> getEnrolledEmployeeDetailsFromModel();
    void addEmployeeToModel(Employee employee);
    void removeEmployeeFromModel(String employeeId);
}
