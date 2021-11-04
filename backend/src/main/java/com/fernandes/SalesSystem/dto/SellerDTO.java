package com.fernandes.SalesSystem.dto;

import com.fernandes.SalesSystem.entities.Sale;
import com.fernandes.SalesSystem.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    //private List<Sale> sales = new ArrayList<>();


    public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }
}
