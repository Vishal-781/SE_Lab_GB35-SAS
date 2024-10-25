package group35.sas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Items_info")
public class ItemModel {
    @Id
    private String itemName;
    private int avlQuantity;
    private double costPrice;
    private double sellPrice;
    private String category;
    
    public ItemModel(){}

    public ItemModel(String itemName, int avlQuantity, double costPrice, double sellPrice,String category) {
        this.itemName = itemName;
        this.avlQuantity = avlQuantity;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.category = category;
    }

    
    public String getItemName() {
        return itemName;
    }

    public int getAvlQuantity() {
        return avlQuantity;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

  

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setAvlQuantity(int avlQuantity) {
        this.avlQuantity = avlQuantity;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
