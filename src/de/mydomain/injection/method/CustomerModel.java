package de.mydomain.injection.method;

public class CustomerModel implements ICustomerModel {

    public String loadCustomer(int id) {
        return "Max Mustermann";
    }
}
