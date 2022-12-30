package com.jojuskills.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@SuppressWarnings("serial")
@Entity
@Table(name="stock" , catalog="baludb", uniqueConstraints= {@UniqueConstraint(columnNames="STOCK_NAME"),@UniqueConstraint(columnNames="STOCK_CODE")})

public class Stock implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STOCK_ID" , unique = true , nullable = false)
	private int stockId; 
	
	@Column(name="STOCK_CODE" , unique = true , nullable = false , length=10)
	private String stockCode;
	
	@Column(name="STOCK_NAME" , unique = true , nullable = false , length=10)
	private String stockName;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "stock_category", catalog = "baludb", joinColumns = {
	@JoinColumn(name = "STOCK_ID", nullable = false, updatable = false) },
	inverseJoinColumns = { @JoinColumn(name = "CATEGORY_ID", nullable = false, updatable = false)})
	
	private Set<Category> categories =new HashSet<Category>(0);

	public Stock() {
		super();
	}

	public Stock(int stockId, String stockCode, String stockName, Set<Category> categories) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.categories = categories;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
}
	
	
	