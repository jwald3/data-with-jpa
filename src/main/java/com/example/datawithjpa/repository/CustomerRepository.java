package com.example.datawithjpa.repository;

import com.example.datawithjpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Optional<Customer> findById(Long id);
}
