package io.explains.myonlymood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.explains.myonlymood.annotation.UniqueUsername;
import io.explains.myonlymood.model.NonEssential.Actives;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor @Data
public class UserAccount implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String ocupation;

    @NotNull @UniqueUsername @Getter
    private String username;

    @NotNull @Getter @Setter
    private String password;

    @Getter @Setter
    private String displayName;

    /*
    @OneToOne
    private Actives actives;*/



    @Override
    @Transient
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }
    @Override
    @Transient
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }

}
