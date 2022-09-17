package com.lauracarpaciu.dao;

import com.lauracarpaciu.entities.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
