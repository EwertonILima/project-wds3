package com.ewertonilima.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonilima.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
