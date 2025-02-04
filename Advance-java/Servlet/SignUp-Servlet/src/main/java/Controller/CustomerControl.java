package Controller;

import Service.CustomerService;

public class CustomerController {
CustomerService customerService =new CustomerService();
public  void addCustomer (Customer customer){
    customerService.ad();

}
}
