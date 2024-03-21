package group35.sas.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales_info")
public class TransactionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer salesId;

    private String itemName;
    private String customerName;
    private Integer quantity;
    
    public TransactionsModel() {
    }
    public TransactionsModel(String itemName, String customerName, Integer quantity) {
        this.itemName = itemName;
        this.customerName = customerName;
        this.quantity = quantity;
    }
    public Integer getSalesId() {
        return salesId;
    }
    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    
}
