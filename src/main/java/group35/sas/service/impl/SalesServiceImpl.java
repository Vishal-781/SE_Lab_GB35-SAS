package group35.sas.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import group35.sas.models.BillModel;
import group35.sas.models.ItemModel;
import group35.sas.models.SalesModel;
import group35.sas.models.TransactionsModel;
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
    public boolean inventoryUpdate(String itemName, Integer q) {
        ItemModel itemModel = itemService.getItem(itemName);
        int x = itemModel.getAvlQuantity();
        x -= q;
        itemModel.setAvlQuantity(x);

        if(x < 0)
        return false;

        return true;
    }

    @Override
    public boolean createTransaction(SalesModel salesModel)
    {
        List<String> items = salesModel.getItems();
        List<Integer> q = salesModel.getQuantities();
        
        for(int i = 0;i<items.size();i++)
        {
            TransactionsModel transactionsModel = new TransactionsModel
            (
                items.get(i), 
                salesModel.getCustomerName(), 
                q.get(i)
            );

            if(!inventoryUpdate(items.get(i), q.get(i)))
            return false;

            salesRepository.save(transactionsModel);
        }

        return true;
    }

    @Override
    public String createSales(SalesModel salesModel) {
        if(createTransaction(salesModel))
        return "Success";

        return "Failure";
    }

    @Override
    public BillModel generateBill(SalesModel salesModel) {
        return null;
    }

    @Override
    public List<TransactionsModel> getAllSales() {
        return salesRepository.findAll();   
    }
    
}
