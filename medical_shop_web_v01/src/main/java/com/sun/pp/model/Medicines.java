package com.sun.pp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Medicines {

    private String name;
    private String batchNo;
    private java.util.Date expiryDate;
    private int balanceQty;
    private String packaging;
    private String uniqueCode;
    private String schemes;
    private double mrp;
    private String manufacturer;
    private String hsnCode;


}
