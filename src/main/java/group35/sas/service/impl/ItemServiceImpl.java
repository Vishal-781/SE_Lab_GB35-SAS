package group35.sas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import group35.sas.exceptions.ItemNotFoundException;
import group35.sas.models.ItemModel;
import group35.sas.repository.ItemRepository;
import group35.sas.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

    ItemRepository itemRepository;
    
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public String createItem(ItemModel itemModel) {
        itemRepository.save(itemModel);
        return "Success";
    }

    @Override
    public String deleteItem(String itemName) {
        itemRepository.deleteById(itemName);
        return "Success";
    }

    @Override
    public List<ItemModel> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public ItemModel getItem(String itemName) {
        if(itemRepository.findById(itemName).isEmpty())
        {
          throw new ItemNotFoundException("Item not Found");
        }
        return itemRepository.findById(itemName).get();
    }

    @Override
    public String updateItem(ItemModel itemModel) {
        itemRepository.save(itemModel);
        return "Success";
    }
    
}
