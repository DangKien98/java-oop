package data;

import utils.Input;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    List<Employee> employeeList = new ArrayList<>();

    private boolean checkDuplicate(String code) {
        for (Employee x : employeeList) {
            if (code.equalsIgnoreCase(x.getId())) {
                System.out.println("Employee is exist.");
                return true;
            }
        }
        return false;
    }

    public void addEmployee() {
        String id;
        String name;
        int age;

        do {
            id = Input.getString("Input id: ", "ID can't be empty");
        }while (checkDuplicate(id));
        name = Input.getString("Input name: ", "Name can't be empty");
        age = Input.getIntBetween("Input age: ", 17, 61, "Employee must be 18..60", "Age must be digit");

        employeeList.add(new Employee(id, name, age));
        System.out.println("Add employee success!\n");
    }

    public void showEmployee() {
        if (employeeList.isEmpty()) {
            System.out.println("Employee is empty!");
            return;
        }

        employeeList.forEach(employee -> System.out.println(employee.toString()));
    }
}
