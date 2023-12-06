package io.explains.myonlymood.repository;

import io.explains.myonlymood.model.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction,Long> {
}
