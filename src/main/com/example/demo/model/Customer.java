package com.example.demo.Model;
import java.time.LocalDate;

public class Customer {
    private String CustomerID;
    private int BranchID;
    private int AccType;
    private int AccSubType;
    private int AccStatus;
    private LocalDate ClosureDate;

    public Customer(String customerID, int branchID, int accType, int accSubType, int accStatus, LocalDate closureDate) {
        this.CustomerID = customerID;
        this.BranchID = branchID;
        this.AccType = accType;
        this.AccSubType = accSubType;
        this.AccStatus = accStatus;
        this.ClosureDate = closureDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public int getBranchID() {
        return BranchID;
    }

    public int getAccType() {
        return AccType;
    }

    public int getAccSubType() {
        return AccSubType;
    }

    public int getAccStatus() {
        return AccStatus;
    }

    public LocalDate getClosureDate() {
        return ClosureDate;
    }
}