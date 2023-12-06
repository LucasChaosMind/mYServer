package io.explains.myonlymood.service.CRUD.Impl;

import io.explains.myonlymood.model.UserAccount;
import io.explains.myonlymood.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {


    private final UserRepository repository;

    public AuthService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAccount user = repository.findUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found.");
        }
        return (UserDetails) user;

    }
}