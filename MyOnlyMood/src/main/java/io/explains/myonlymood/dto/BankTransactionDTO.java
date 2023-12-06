package io.explains.myonlymood.dto;

import io.explains.myonlymood.model.BankActiveCategory;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankTransactionDTO {

    private Long id;

    private BankActiveCategory activeCategory;

    private LocalDate transactionDate;

    private BigDecimal thePrice;
}
