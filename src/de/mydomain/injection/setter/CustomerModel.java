package de.mydomain.injection.constructor;

public class CustomerModel implements ICustomerModel {

    public String loadCustomer(int id) {
        return "Max Mustermann";
    }
}
