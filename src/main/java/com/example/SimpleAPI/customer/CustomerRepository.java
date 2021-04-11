package com.example.SimpleAPI.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        //Connect to Real DB
        return Collections.emptyList();
    }
}
