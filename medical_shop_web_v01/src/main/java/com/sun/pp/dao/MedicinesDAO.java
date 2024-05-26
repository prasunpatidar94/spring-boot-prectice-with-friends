package com.sun.pp.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "Medicines")
@Data
public class MedicinesDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String cName;
    private String cBatchNo;
    private java.util.Date dExpiryDate;
    private int nBalanceQty;
    private String cPackaging;
    private String cUniqueCode;
    private String cSchemes;
    private double nMrp;
    private String cManufacturer;
    private String hsnCode;
}
