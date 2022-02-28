package de.mydomain.injection.setter;

public class CustomerService {

    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        customerController.setCustomerModel(new CustomerModel());

        System.out.println(customerController.loadCustomer(1));
    }
}
