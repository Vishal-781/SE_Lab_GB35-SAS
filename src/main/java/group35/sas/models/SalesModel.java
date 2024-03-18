package group35.sas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales_info")
public class SalesModel {
    @Id
    private String salesId;
    private String customerName;
    private String phoneNumber;
    private String itemName;

    public SalesModel() {
    }
    public SalesModel(String salesId, String customerName, String phoneNumber, String itemName) {
        this.salesId = salesId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.itemName = itemName;
    }
    public String getSalesId() {
        return salesId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getItemName() {
        return itemName;
    }
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    

}
