package group35.sas.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import group35.sas.models.ItemModel;
import group35.sas.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
    
    ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // read specific user
    @GetMapping("{itemName}") 
    public ItemModel getItem(@PathVariable("itemName") String itemName){
        return itemService.getItem(itemName);
    }

    // read all users
    @GetMapping
    public List<ItemModel> getAllItems(){
        return itemService.getAllItems();
    }


    @PostMapping
    public String createItem(@RequestBody ItemModel itemModel){
        itemService.createItem(itemModel);
        return "New Item added";
    }

    @PutMapping
    public String updateItem(@RequestBody ItemModel itemModel) {;
        itemService.updateItem(itemModel);
        return "Item updated successfully";
    }

    @DeleteMapping("{itemName}")
    public String deleteItem(@PathVariable("itemName") String itemName){
        // return "Hi";
        itemService.deleteItem(itemName);
        return "Item deleted successfully";
    }
}

