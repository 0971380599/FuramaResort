package services;

import models.Employee;

public interface EmployeeService {
    public void addNewEmployee();
    public void displayListEmployees();
    public Employee isEmployee(int employeeCode);
    public void editEmployee();
}
