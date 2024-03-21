package group35.sas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group35.sas.customResponses.FailureResponse;
import group35.sas.models.BillModel;
import group35.sas.models.SalesModel;
import group35.sas.models.TransactionsModel;
import group35.sas.service.SalesService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    
    SalesService salesService;
    
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    @PostMapping
    public BillModel createSales(@RequestBody SalesModel salesModel){
        return salesService.generateBill(salesModel);
    }
    @GetMapping
    public List<TransactionsModel> getMethodName() {
        return salesService.getAllSales();
    }
    
}
