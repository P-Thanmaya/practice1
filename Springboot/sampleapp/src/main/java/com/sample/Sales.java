package com.sample;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Sales {
	@Id
	private int salesid;
	private int max;
	private int min;
	@OneToOne
	@JoinColumn(name="customerid")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="itemid")
	private Item item;
	@OneToOne(mappedBy="sales")
	private Bill bill;
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	public Sales() {
		super();
	}
	@Override
	public String toString() {
		return "Sales [salesid=" + salesid + ", max=" + max + ", min=" + min + ", customer=" + customer + ", item="
				+ item + ", bill=" + bill + "]";
	}
	
}