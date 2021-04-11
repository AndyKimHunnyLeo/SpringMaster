package com.example.SimpleAPI.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "hello"),
                new Customer(2L, "world"),
                new Customer(3L, "I am"),
                new Customer(4L, "Back"),
                new Customer(5L, "guys!")
        );
    }
}
