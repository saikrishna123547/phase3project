package com.demo.main;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name= "purchase_items")  
@Setter
@Getter
@AllArgsConstructor
@ToString
public class PurchaseItems {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
private long ID;
@Column(name = "rate")
private BigDecimal rate;

@Column(name = "qty")
private int qty;

@Column(name = "price")
private BigDecimal price;


}