package com.cetpa.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.Model.Product;
public interface ProductRepository extends JpaRepository<Product,Integer> 
{
}
