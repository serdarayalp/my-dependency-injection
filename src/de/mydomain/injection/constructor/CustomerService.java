package de.mydomain.injection.constructor;

public class CustomerService {

    public static void main(String[] args) {
        CustomerController customerController = new CustomerController(new CustomerModel());
        System.out.println(customerController.loadCustomer(1));
    }
}
