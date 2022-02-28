package de.mydomain.injection.method;

public class CustomerService {

    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();

        customerController.setDependency(new CustomerModel());

        System.out.println(customerController.loadCustomer(1));
    }
}
