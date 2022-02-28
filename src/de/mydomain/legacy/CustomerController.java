package de.mydomain.legacy;

public class CustomerController {

    private final CustomerModel customerModel;

    public CustomerController() {
        // Lokale Abhängigkeit hier ist aufzulösen!
        this.customerModel = new CustomerModel();
    }

    public String loadCustomer(int id) {
        return customerModel.loadCustomer(id);
    }
}
