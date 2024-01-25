package com.integrador.spring.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_categories")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@Column(columnDefinition="date default getDate()")
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;

	public ProductCategory() {
		
	}

	public ProductCategory(String name) {
		this.name = name;
		this.created_at = new Date(System.currentTimeMillis());
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setName(String name2) {
		this.name = name2;
	}
	
	
}