package group35.sas.models;

import java.util.*;

public class BillModel {
    private String customerName;
    private List<String> items;
    private List<Integer> quantity;
    private List<Double> amount;
    private Double totalAmount;

    public BillModel(String customerName, List<String> items, List<Integer> quantity, List<Double> amount,
            Double totalAmount) {
        this.customerName = customerName;
        this.items = items;
        this.quantity = quantity;
        this.amount = amount;
        this.totalAmount = totalAmount;
    }

    public BillModel() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public List<Double> getAmount() {
        return amount;
    }

    public void setAmount(List<Double> amount) {
        this.amount = amount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}
