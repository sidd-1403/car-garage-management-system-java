package CarGarageSystem;

import java.net.Socket;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome To MotorMinds Garage");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter customer name: ");
            String name = sc.nextLine();

            System.out.println("Enter car number: ");
            String carNumber = sc.nextLine();

            System.out.println("Enter car type: ");
            String carType = sc.nextLine();

            Customer customer = new Customer(name, carNumber, carType);

            Service services[] = {
                    new Service(1, "Oil Change", 500),
                    new Service(2, "Car Wash", 300),
                    new Service(3, "Break Check", 150),
                    new Service(4, "Coolant Change", 200),
                    new Service(5, "Full Service", 1000),};

            boolean[] selected = new boolean[services.length];

            System.out.println("\n --Available Services-- ");
            for (Service s : services) {
                System.out.println(s.getId() + ". " + s.getName() + "- " + s.getPrice());
            }

            while (true) {
                System.out.println("\nPress '0' bill generate");

                System.out.println("Select Services ID ");
                int choice = sc.nextInt();

                if (choice == 0) {
                    //final billing
                    System.out.println("\nCustomer Name: " + customer.getName());
                    System.out.println("CarNo: " + customer.getCarNumber());
                    System.out.println("CarType: " + customer.getCarType());
                    System.out.println("Services Availed ");

                    for (int j = 0; j < selected.length; j++) {
                        if (selected[j]) {
                            System.out.println("- " + services[j].getName() + ": " + services[j].getPrice());
                        }
                    }
                    System.out.println("----------------------------");
                    int total = BillCalculator.calculator(services, selected);
                    System.out.println("Total Amount " + total);
                    System.out.println("Thank You! Visit Again....");
                    break;
                }

                if (choice < 0 || choice > services.length) {
                    throw new Exception("Invalid Service Selection..Please Select Correct Services");
                }

                selected[choice - 1] = true;
                System.out.println("Services Added: " + services[choice - 1].getName());

                System.out.println("\n ---Available Services--- ");
                int i = 0;
                for (Service s : services) {
                    if (selected[i] == false) {

                        System.out.println(s.getName() + " : " + s.getPrice());
                    }
                    i++;
                }

            }

        } catch (
                Exception e) {
            System.out.println("Error " + e.getMessage());

        }

    }
}
