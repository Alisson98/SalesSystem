package com.fernandes.SalesSystem.services;

import com.fernandes.SalesSystem.dto.SaleDTO;
import com.fernandes.SalesSystem.dto.SaleSuccessDTO;
import com.fernandes.SalesSystem.dto.SaleSumDTO;
import com.fernandes.SalesSystem.entities.Sale;
import com.fernandes.SalesSystem.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaleService {
    @Autowired
    SaleRepository repository;

    public Page<SaleDTO> findAll(Pageable pegeable) {
        Page<Sale> response =  repository.findAll(pegeable);
        return response.map(SaleDTO::new);
    }

    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }

}
