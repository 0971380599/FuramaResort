package services;


import models.Customer;

public interface CustomerService {
    public void displayListCustomer();
    public void addNewCustomer();
    public Customer isCustomer(int customerCode);
    public void editCustomer();
    public void deleteCustomer();
}
