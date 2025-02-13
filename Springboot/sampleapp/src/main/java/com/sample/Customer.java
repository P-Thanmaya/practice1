package com.sample;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    private int customerid;
    private String customername;
    private long phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Item> items;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Customer [customerid=" + customerid + ", customername=" + customername + ", phone=" + phone + ", items=" + items + "]";
    }

    public Customer() {
        super();
    }
}