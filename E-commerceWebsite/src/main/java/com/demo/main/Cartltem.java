package com.demo.main;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Cartltem {
	private BigDecimal rate;
	private BigDecimal price;
	private int qty;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinTable(name = "cart_products",
	joinColumns = @JoinColumn(name="cartitem_id"),
	inverseJoinColumns = @JoinColumn(name="product_id"))
	List<Product> products = new ArrayList<>();
}

