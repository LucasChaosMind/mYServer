package io.explains.myonlymood.service;

import io.explains.myonlymood.model.UserAccount;
import io.explains.myonlymood.repository.UserRepository;
import io.explains.myonlymood.service.CRUD.IUserCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends RestrictCrudServiceImpl<UserAccount, Long> implements IUserCrud {

    private final UserRepository repository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected JpaRepository<UserAccount, Long> getRepository() {
        return repository;
    }

    @Override
    public UserAccount save(UserAccount userAccount){
        userAccount.setPassword(passwordEncoder.encode(userAccount.getPassword()));
        return repository.save(userAccount);
    }


}
