package service.impl;

import entity.Customer;
import org.springframework.stereotype.Service;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private static List<Customer> list = new ArrayList<>();

    static {
        Customer customer = new Customer();

        customer.setId(1L);
        customer.setAge(25L);
        customer.setName("Customer1");
        customer.setLocation("Nepal");
        list.add(customer);

        customer.setId(2L);
        customer.setAge(25L);
        customer.setName("Customer2");
        customer.setLocation("Nepal");
        list.add(customer);

        customer.setId(3L);
        customer.setAge(25L);
        customer.setName("Customer3");
        customer.setLocation("Nepal");
        list.add(customer);
    }

    public List<Customer> getList (){
        return list;
    }

}
