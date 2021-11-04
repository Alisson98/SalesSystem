package com.fernandes.SalesSystem.services;

import com.fernandes.SalesSystem.dto.SellerDTO;
import com.fernandes.SalesSystem.entities.Seller;
import com.fernandes.SalesSystem.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> response =  repository.findAll();
        return response.stream().map(SellerDTO::new).collect(Collectors.toList());
    }

}
