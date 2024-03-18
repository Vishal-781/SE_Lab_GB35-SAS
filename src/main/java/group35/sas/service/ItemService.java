package group35.sas.service;


import java.util.List;
import group35.sas.models.ItemModel;


public interface ItemService {
     public String createItem(ItemModel itemModel);
    public String updateItem(ItemModel itemModel);
    public String deleteItem(String itemName);
    public ItemModel getItem(String itemName);
    public List<ItemModel> getAllItems();
}
