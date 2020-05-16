package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private List<Employee> employees = new ArrayList();

    String firstCapitalLetter(String input){
        return input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
    }

    public void showEmployeesMinimal() {
        for (Employee item: employees) {
            item.showEmployeeMinimal();
        }
    }

    public void addEmployee() {
        //todo Wykonanie sprawdzenia dla wpisywanych danych
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię pracownika: ");
        String firstName = firstCapitalLetter(scanner.nextLine());
        System.out.print("Podaj nazwisko pracownika: ");
        String lastName = firstCapitalLetter(scanner.nextLine());
        System.out.print("Podaj płeć (K/M): ");
        Character sex = scanner.nextLine().toUpperCase().charAt(0);
        System.out.print("Podaj nr działu: ");
        Integer department = scanner.nextInt();
        System.out.print("Podaj płacę: ");
        Float salary = scanner.nextFloat();
        System.out.print("Podaj wiek: ");
        Integer age = scanner.nextInt();
        System.out.print("Podaj liczbę dzieci: ");
        Integer numberOfChildren = scanner.nextInt();
        System.out.print("Stan cywilny (true/false): ");
        boolean maritalStatus = scanner.nextBoolean();

        Employee employee = new Employee(firstName,lastName,sex);
        employee.setDepartment(department);
        employee.setSalary(salary);
        employee.setAge(age);
        employee.setNumberOfChildren(numberOfChildren);
        employee.setMaritalStatus(maritalStatus);

        employees.add(employee);
    }

    public void export() {
    }

    public void deleteEmployee() {
    }

    public void editEmployee() {
    }

    public void additionalFeatures() {
    }

    public void exportAndFeatures() {
    }

    public void getSystemInfo() {
        System.out.println("Program version 0.1 beta");
    }

    public void changeDatabaseName() {
    }
}
