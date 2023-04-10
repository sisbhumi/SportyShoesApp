package com.example.sportyshoeswebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sportyshoeswebapp.entity.Admin;

@Repository	
public interface AdminRepository extends CrudRepository<Admin, Integer>	 {

}
