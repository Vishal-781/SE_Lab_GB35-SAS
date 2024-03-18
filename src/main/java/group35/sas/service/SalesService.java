package group35.sas.service;

import group35.sas.models.BillModel;
import group35.sas.models.SalesModel;
import java.util.List;

public interface SalesService {
    public BillModel generateBill(SalesModel salesModel);
    public void inventoryUpdate(SalesModel salesModel);
    public String createSales(SalesModel salesModel);
    public List<SalesModel> getAllSales();

}
