package io.explains.myonlymood.model.NonEssential;

import io.explains.myonlymood.model.AccountBank;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Actives {

    @Id
    private Long id;

    @ManyToMany
    private List<AccountBank> banks;

    @ManyToMany
    private List<InvestmentBroker> investmentBrokers;

}
