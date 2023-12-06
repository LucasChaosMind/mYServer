package io.explains.myonlymood.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity @Builder @NoArgsConstructor @AllArgsConstructor @Data
public class BankTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private BankActiveCategory activeCategory;

    /* Precisa de uma Annotation para automatizar a data e hora
    @NotNull
    private LocalDate transactionDate;
    */

    @NotNull
    private BigDecimal thePrice;

}
