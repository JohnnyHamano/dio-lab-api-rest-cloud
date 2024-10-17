package com.digitalinnovationone.webstore.domain.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tb_transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long id_client;
    
    private List<Long> id_products;

    @Column(name = "total_price", scale = 2)
    private float total_price;
    
    @Column(name = "purchase_date")
    private Date purchase_date;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId_client() {
        return id_client;
    }
    
    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }
    
    public List<Long> getId_products() {
        return id_products;
    }
    
    public void setId_products(List<Long> id_products) {
        this.id_products = id_products;
    }
    
    public float getTotal_price() {
        return total_price;
    }
    
    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }
    
    public Date getPurchase_date() {
        return purchase_date;
    }
    
    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }
}