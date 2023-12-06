package io.explains.myonlymood.dto.NonEssential;

import io.explains.myonlymood.model.NonEssential.InvestmentTransactions;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class InvestmentBrokerDTO {

    @NotNull
    private String name;

    @NotNull
    private String code;

    @ManyToMany
    private List<InvestmentTransactions> transactions;

}
