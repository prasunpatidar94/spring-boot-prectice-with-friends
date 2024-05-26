package com.sun.pp.service;

import com.sun.pp.dao.MedicinesDAO;
import com.sun.pp.model.Medicines;
import com.sun.pp.repo.MedicienseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@Service
public class MedicinesService implements Services {

    @Autowired
    private  MedicienseRepository medicienseRepository;

    @Override
    public Medicines createMedi(Medicines medicines) {
        MedicinesDAO medicinesDAO = new MedicinesDAO();
        medicinesDAO.setCName(medicines.getName());
        medicinesDAO.setCBatchNo(medicines.getBatchNo());
        medicinesDAO.setDExpiryDate(Calendar.getInstance().getTime());
        medicinesDAO.setNBalanceQty(medicines.getBalanceQty());
        medicinesDAO.setCPackaging(medicines.getPackaging());
        medicinesDAO.setCUniqueCode(medicines.getUniqueCode());
        medicinesDAO.setCSchemes(medicines.getSchemes());
        medicinesDAO.setNMrp(medicines.getMrp());
        medicinesDAO.setCManufacturer(medicines.getManufacturer());
        medicinesDAO.setHsnCode(medicines.getHsnCode());
        System.out.println("id is :"+ medicinesDAO.getCName());

        Optional<MedicinesDAO> medicinesDAOSave = Optional.of(medicienseRepository.save(medicinesDAO));
        if (medicinesDAOSave.isPresent()) {
            medicines.setName(medicinesDAO.getCName());
            medicines.setBatchNo(medicinesDAO.getCBatchNo());
            medicines.setExpiryDate(Calendar.getInstance().getTime());
            medicines.setBalanceQty(medicinesDAO.getNBalanceQty());
            medicines.setPackaging(medicinesDAO.getCPackaging());
            medicines.setUniqueCode(medicinesDAO.getCUniqueCode());
            medicines.setSchemes(medicinesDAO.getCSchemes());
            medicines.setMrp(medicinesDAO.getNMrp());
            medicines.setManufacturer(medicinesDAO.getCManufacturer());
            medicines.setHsnCode(medicinesDAO.getHsnCode());
            System.out.println("name  is :"+ medicines.getName());
            return medicines;
        } else {
            return null;
        }


    }
}
