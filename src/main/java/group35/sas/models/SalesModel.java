package group35.sas.models;
import java.util.*;


public class SalesModel {
    private String customerName;
    private String phoneNumber;
    private List<String>  items;
    private List<Integer> quantities;

    public SalesModel() {
    }
    public SalesModel(String customerName, String phoneNumber,List<String>  items, List<Integer> quantities) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.quantities = quantities;
    }
 
    public String getCustomerName() {
        return customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getItems() {
        return items;
    }
    public void setItems(List<String> items) {
        this.items = items;
    }
    
    public List<Integer> getQuantities() {
        return quantities;
    }
    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }
    

}
