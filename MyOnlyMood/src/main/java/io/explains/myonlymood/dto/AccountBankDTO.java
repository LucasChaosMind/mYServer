package io.explains.myonlymood.dto;

import io.explains.myonlymood.model.BankTransaction;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountBankDTO {

    private Long id;

    private String name;

    private String bankName;

    private String accountNumber;

    private List<BankTransaction> transactions;

}
