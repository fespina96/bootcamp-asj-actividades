package com.integrador.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.spring.models.ProductsPerOrder;
import com.integrador.spring.repositories.ProductsPerOrderRepository;

@Service
public class ProductsPerOrderService {
	@Autowired
	ProductsPerOrderRepository productsPerOrderRepository;
	
	public List<ProductsPerOrder> getProductsPerOrders(){
		return productsPerOrderRepository.findAll();
	}
	
	public ProductsPerOrder getProductsPerOrderById(int id) {
		ProductsPerOrder  ppo= null;
		for(ProductsPerOrder productsPerOrder:productsPerOrderRepository.findAll()) {
			if(productsPerOrder.getId().getOrderId()==id) {
				ppo=productsPerOrder;
			}
		}
		return ppo;
	}
}