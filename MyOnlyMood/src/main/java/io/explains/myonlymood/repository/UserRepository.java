package io.explains.myonlymood.repository;

import io.explains.myonlymood.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findUserByUsername(String username);

}