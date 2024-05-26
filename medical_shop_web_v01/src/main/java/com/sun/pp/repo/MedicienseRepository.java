package com.sun.pp.repo;

import com.sun.pp.dao.MedicinesDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicienseRepository extends JpaRepository<MedicinesDAO,Long > {
}
