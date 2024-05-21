package org.example.th_qlks7_md3.service;


import org.example.th_qlks7_md3.model.Customer;
import org.example.th_qlks7_md3.model.Province;

public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
