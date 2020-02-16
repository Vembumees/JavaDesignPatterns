package MVC.model;

public class Employee {
    private String empName;
    private String empId;

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee empObject = (Employee) o;
        if (!empName.equals(empObject.empName)) return false;
        if (!empId.equals(empObject.empId)) return false;
        return true;
    }
}
