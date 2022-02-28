package de.mydomain.injection.setter;

public class CustomerController {

    private ICustomerModel customerModel;

    public CustomerController() {
    }

    public String loadCustomer(int id) {
        return customerModel.loadCustomer(id);
    }

    public ICustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(ICustomerModel customerModel) {
        this.customerModel = customerModel;
    }
}
