package com.peticom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.peticom.model.Customers;

import java.util.List;

public interface CustomersRepo extends CrudRepository<Customers, Integer> {

    List<Customers> findAll();
}
