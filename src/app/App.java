package app;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();

        while (true) {
            System.out.println("\nEnter a command (add, edit, delete, list or exit):");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Enter customer full name:");
                String name = scanner.nextLine();

                // validation
                while (name.length() < 3) {
                    System.out.println("Name should be longer than 3 characters. Please enter again:");
                    name = scanner.nextLine();
                }

                System.out.println("Enter VAT identification number:");
                String vatIdNum = scanner.nextLine();

                System.out.println("Enter creation date:");
                String cdate = scanner.nextLine();

                System.out.println("Enter address:");
                String address = scanner.nextLine();

                Customer customer = new Customer(name, vatIdNum, cdate, address);
                management.addCustomer(customer);
                System.out.println("Customer added.");

            } else if (command.equalsIgnoreCase("edit")) {
                System.out.println("Enter index of customer to edit:");
                int index = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter which part to edit (name, vat, address or all):");
                String partToEdit = scanner.nextLine();

                if (partToEdit.equalsIgnoreCase("name")) {
                    System.out.println("Enter new customer name: ");
                    String name = scanner.nextLine();

                    while (name.length() < 3) {
                        System.out.println("Name must be at least 3 characters long. Please enter a valid name:");
                        name = scanner.nextLine();
                    }

                    Customer customer = management.listCustomers().get(index);
                    customer.setName(name);
                    management.editCustomer(index, customer);
                    System.out.println("Customer name updated.");

                } else if (partToEdit.equalsIgnoreCase("vat")) {
                    System.out.println("Enter new VAT identification number: ");
                    String vatIdNum = scanner.nextLine();

                    Customer customer = management.listCustomers().get(index);
                    customer.setVatIdNum(vatIdNum);
                    management.editCustomer(index, customer);
                    System.out.println("Customer VAT identification number updated.");

                } else if (partToEdit.equalsIgnoreCase("address")) {
                    System.out.println("Enter new customer address: ");
                    String address = scanner.nextLine();

                    Customer customer = management.listCustomers().get(index);
                    customer.setAddress(address);
                    management.editCustomer(index, customer);
                    System.out.println("Customer address updated.");

                } else if (partToEdit.equalsIgnoreCase("all")) {
                    System.out.println("Enter new customer name: ");
                    String name = scanner.nextLine();

                    while (name.length() < 3) {
                        System.out.println("Name must be at least 3 characters long. Please enter a valid name:");
                        name = scanner.nextLine();
                    }

                    System.out.println("Enter new VAT identification number: ");
                    String vatIdNum = scanner.nextLine();

                    System.out.println("Enter new customer address: ");
                    String address = scanner.nextLine();

                    System.out.println("Enter new creation date:");
                    String cdate = scanner.nextLine();

                    Customer customer = new Customer(name, vatIdNum, cdate, address);
                    management.editCustomer(index, customer);
                    System.out.println("Customer details updated.");

                } else {
                    System.out.println("Invalid part to edit entered.");
                }

            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                System.exit(0);

            } else if (command.equalsIgnoreCase("delete")) {
                System.out.println("Enter index of customer to delete: ");
                int index = Integer.parseInt(scanner.nextLine());
                management.deleteCustomer(index);
                System.out.println("Customer deleted.");

            } else if (command.equalsIgnoreCase("list")) {
                List<Customer> customers = management.listCustomers();

                for (int i = 0; i < customers.size(); i++) {
                    System.out.println("\nCustomer " + (i + 1) + ":");
                    System.out.println(customers.get(i).toString());
                }

            }
        }
    }
}
