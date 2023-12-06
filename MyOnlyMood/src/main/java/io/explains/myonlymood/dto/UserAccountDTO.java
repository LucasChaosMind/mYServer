package io.explains.myonlymood.dto;

import io.explains.myonlymood.annotation.UniqueUsername;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor @Data
public class UserAccountDTO {

    private Long id;

    private String ocupation;

    private String username;

    private String password;

    private String displayName;
}
