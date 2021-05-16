package main;

import data.EmployeeManagement;
import utils.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Employee Management");
        menu.add("Add Employee");
        menu.add("Show Employee");
        menu.add("Exit");

        int choice;
        EmployeeManagement employeeManagement = new EmployeeManagement();

        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1: {
                    employeeManagement.addEmployee();
                    break;
                }
                case 2: {
                    employeeManagement.showEmployee();
                    break;
                }
            }
        } while (choice != menu.getListMenu().size());
    }
}
