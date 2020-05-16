package pl.sda.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nWitaj w systemie ERP!\n" +
                    "1. Pokaż wszystkich pracowników - krótka wersja\n" +
                    "2. Dodaj nowego pracownika\n" +
                    "3. Export do pliku danych pracownika\n" +
                    "4. Usuń pracownika\n" +
                    "5. Edycja danych pracownika\n" +
                    "6. Przejście do podmenu 1...\n" +
                    "7. Export danych i przejście do podmenu 2...\n" +
                    "8. Informacja o systemie\n" +
                    "9. Zmiana nazwy bazy danych\n" +
                    "0. Wyjście z systemu");

            switch (scanner.nextLine()){
                case "1":
                    employeeService.showEmployeesMinimal();
                    break;
                case "2":
                    employeeService.addEmployee();
                    break;
                case "3":
                    employeeService.export();
                    break;
                case "4":
                    employeeService.deleteEmployee();
                    break;
                case "5":
                    employeeService.editEmployee();
                    break;
                case "6":
                    employeeService.additionalFeatures();
                    break;
                case "7":
                    employeeService.exportAndFeatures();
                    break;
                case "8":
                    employeeService.getSystemInfo();
                    break;
                case "9":
                    employeeService.changeDatabaseName();
                    break;
                default:
                    System.exit(1);
            }

        }
        }
    }

