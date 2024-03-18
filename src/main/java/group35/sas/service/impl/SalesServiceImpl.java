package group35.sas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import group35.sas.models.BillModel;
import group35.sas.models.ItemModel;
import group35.sas.models.SalesModel;
import group35.sas.repository.SalesRepository;
import group35.sas.service.ItemService;
import group35.sas.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService{
    SalesRepository salesRepository;
    ItemService itemService;

    public SalesServiceImpl(SalesRepository salesRepository,ItemService itemService) {
        this.salesRepository = salesRepository;
        this.itemService = itemService;
    }

    @Override
    public void inventoryUpdate(SalesModel salesModel) {
        String itemName = salesModel.getItemName();
        ItemModel item = itemService.getItem(itemName);
        int x = item.getAvlQuantity();
        x--;
        item.setAvlQuantity(x);
        itemService.updateItem(item);
    }

    @Override
    public String createSales(SalesModel salesModel) {
        salesRepository.save(salesModel);
        return "Success";
    }

    @Override
    public BillModel generateBill(SalesModel salesModel) {
        return null;
    }

    @Override
    public List<SalesModel> getAllSales() {
        return salesRepository.findAll();   
    }
    
}
