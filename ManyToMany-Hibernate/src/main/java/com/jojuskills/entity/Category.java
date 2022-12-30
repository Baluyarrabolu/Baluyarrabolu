package com.jojuskills.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="category" , catalog = "baludb")
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CATEGORY_ID" , unique = true , nullable = false)
	private int categoryId;
	
	@Column(name="NAME" , unique = true , nullable = false , length = 10)
	private String name;
	 
	@Column(name="[DESC]" , unique = true , nullable = false)
	private String desc;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	private Set<Stock> stocks=new HashSet<Stock>(0);

	public Category() {
		super();
	}

	public Category(String name, String desc, Set<Stock> stocks) {
		super();
		this.name = name;
		this.desc = desc;
		this.stocks = stocks;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}
	
}
