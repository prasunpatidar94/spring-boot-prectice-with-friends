package com.sun.pp.service;

import com.sun.pp.model.Medicines;
import org.springframework.stereotype.Service;

@Service
public interface Services {


    Medicines createMedi(Medicines medicines);
}
