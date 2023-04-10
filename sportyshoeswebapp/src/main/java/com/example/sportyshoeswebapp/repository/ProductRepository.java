package com.example.sportyshoeswebapp.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sportyshoeswebapp.entity.Admin;
import com.example.sportyshoeswebapp.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>	 {
//	 Collection<Admin> getAdmins();
}
