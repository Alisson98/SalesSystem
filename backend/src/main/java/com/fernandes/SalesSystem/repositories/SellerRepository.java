package com.fernandes.SalesSystem.repositories;

import com.fernandes.SalesSystem.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
