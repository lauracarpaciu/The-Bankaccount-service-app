package com.lauracarpaciu.dao;

import com.lauracarpaciu.entity.account.Account;
import com.lauracarpaciu.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByAccountNumber(String accountNumber);
}
