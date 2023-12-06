package io.explains.myonlymood.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor @Data
public class AccountBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String bankName;

    @NotNull
    private String accountNumber;

    @OneToMany
    private List<BankTransaction> transactions;

    @OneToOne
    private UserAccount userAccount;

}
