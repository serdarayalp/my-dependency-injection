package de.mydomain.injection.method;

public class CustomerController implements ICustomerController{

    private ICustomerModel customerModel;

    public CustomerController() {
    }

    public String loadCustomer(int id) {
        return customerModel.loadCustomer(id);
    }

    @Override
    public void setDependency(ICustomerModel customerModel) {
        this.customerModel = customerModel;
    }
}
