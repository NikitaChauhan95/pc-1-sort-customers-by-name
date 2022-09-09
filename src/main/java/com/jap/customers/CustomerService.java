package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> nameList = new ArrayList<>();
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            nameList.add(customer.getCustomerName());
        }
        Collections.sort(nameList);
        return nameList;
    }


}
