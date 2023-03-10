package com.ashish.spring.demo.stock.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {
	ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);


}
