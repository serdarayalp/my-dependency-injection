package de.mydomain.injection.constructor;

public class CustomerController {

    private final ICustomerModel customerModel;

    public CustomerController(ICustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public String loadCustomer(int id) {
        return customerModel.loadCustomer(id);
    }
}
