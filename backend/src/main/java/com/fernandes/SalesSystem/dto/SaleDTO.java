package com.fernandes.SalesSystem.dto;

import com.fernandes.SalesSystem.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO sellerDTO;

    public SaleDTO(Sale sale) {
        this.id = sale.getId();
        this.visited = sale.getVisited();
        this.deals = sale.getDeals();
        this.amount = sale.getAmount();
        this.date = sale.getDate();
        this.sellerDTO = new SellerDTO(sale.getSeller());
    }
}
