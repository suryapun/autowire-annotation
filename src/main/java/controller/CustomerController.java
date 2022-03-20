package controller;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.impl.CustomerServiceImpl;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/list")
    public List<Customer> getList(){
        return null;
    }
}
