package com.sample;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bill {
	@Id
	private int billnumber;
	private float price;
	@OneToOne
	@JoinColumn(name="salesid")
	private Sales sales;
	public int getBillnumber() {
		return billnumber;
	}
	public void setBillnumber(int billnumber) {
		this.billnumber = billnumber;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "Bill [billnumber=" + billnumber + ", price=" + price + ", sales=" + sales + "]";
	}
	public Bill() {
		super();
	}
	
	
	

}

