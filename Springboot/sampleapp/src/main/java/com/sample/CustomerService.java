package com.sample;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerdao;

    public List<Customer> getAllCustomers() {
        return customerdao.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerdao.save(customer);
    }
}
