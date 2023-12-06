package io.explains.myonlymood.dto.NonEssential;

import io.explains.myonlymood.model.AccountBank;
import io.explains.myonlymood.model.NonEssential.InvestmentBroker;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class ActivesDTO {

    @ManyToMany
    private List<AccountBank> banks;

    @ManyToMany
    private List<InvestmentBroker> investmentBrokers;

}
