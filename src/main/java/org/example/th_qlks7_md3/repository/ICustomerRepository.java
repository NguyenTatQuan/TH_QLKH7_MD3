package org.example.th_qlks7_md3.repository;


import org.example.th_qlks7_md3.model.Customer;
import org.example.th_qlks7_md3.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}

