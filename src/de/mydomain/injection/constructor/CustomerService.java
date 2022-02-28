package de.mydomain.legacy;

public class CustomerService {

    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        System.out.println(customerController.loadCustomer(1));
    }
}
