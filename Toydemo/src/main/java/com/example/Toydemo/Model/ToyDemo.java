package com.example.Toydemo.Model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="demo")
	public class ToyDemo {
	@Id
	@Column(unique=true)
	private int sno;
	@Column(name="toyname",nullable=false)
	private String toyname;
	@Column(name="cost",nullable=false)
	private int cost;
	
	ToyDemo(){}
	
	public int getSno() {
		return sno;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getToyname() {
		return toyname;
	}
	
	public void setToyname(String toyname) {
		this.toyname = toyname;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	}
