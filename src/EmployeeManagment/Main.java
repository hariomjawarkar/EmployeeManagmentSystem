package EmployeeManagment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Hariom IT Solutions ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String role = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    service.addEmployee(new Employee(id, name, dept, role, sal));
                    break;
                case 2:
                    service.viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    Employee emp = service.searchById(searchId);
                    System.out.println(emp != null ? emp : "Employee not found.");
                    break;
                case 4:
                    System.out.print("Enter ID to update: ");
                    int upId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Department: ");
                    String newDept = sc.nextLine();
                    System.out.print("Enter New Designation: ");
                    String newDes = sc.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSal = sc.nextDouble();
                    service.updateEmployee(upId, newName, newDept, newDes, newSal);
                    break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    service.deleteEmployee(delId);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
