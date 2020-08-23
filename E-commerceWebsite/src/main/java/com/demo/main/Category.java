package com.demo.main;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name= "category")  

public class Category {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID")
		private long ID;
		@Column(name = "name")
		private String name;
		@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
		@JoinTable(name = "category_products",
		joinColumns = @JoinColumn(name="category_id"),
		inverseJoinColumns = @JoinColumn(name="product_id"))
		List<Product> products = new ArrayList<>(); 
}
