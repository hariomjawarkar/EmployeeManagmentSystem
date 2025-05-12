package EmployeeManagment;

import java.util.*;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employee records found.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    public Employee searchById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void updateEmployee(int id, String name, String dept, String role, double salary) {
        Employee emp = searchById(id);
        if (emp != null) {
            emp.setName(name);
            emp.setDepartment(dept);
            emp.setDesignation(role);
            emp.setSalary(salary);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int id) {
        Employee emp = searchById(id);
        if (emp != null) {
            employeeList.remove(emp);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
