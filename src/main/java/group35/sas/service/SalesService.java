package group35.sas.service;

import group35.sas.models.BillModel;
import group35.sas.models.SalesModel;
import group35.sas.models.TransactionsModel;

import java.util.List;

public interface SalesService {
    public BillModel generateBill(SalesModel salesModel);
    public boolean inventoryUpdate(String itemName,Integer q);
    public String createSales(SalesModel salesModel);
    public boolean createTransaction(SalesModel salesModel);
    public List<TransactionsModel> getAllSales();

}
