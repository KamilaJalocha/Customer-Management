package app;
import java.util.ArrayList;
import java.util.List;


//customer objects, providing methods for adding, editing, deleting and listing customers
public class Management {
    private List<Customer> customers;

    public Management() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void editCustomer(int index, Customer customer) {
        customers.set(index, customer);
    }

    public void deleteCustomer(int index) {
        customers.remove(index);
    }

    public List<Customer> listCustomers() {
        return new ArrayList<>(customers);
    }

}
