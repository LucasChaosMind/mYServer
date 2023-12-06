package io.explains.myonlymood.dto;

import io.explains.myonlymood.model.enums.BanksActiveType;
import io.explains.myonlymood.model.enums.TransferStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankActiveCategoryDTO {
    private Long id;

    private Integer priority;

    private BanksActiveType Type;

    private TransferStatus statusType;
}
