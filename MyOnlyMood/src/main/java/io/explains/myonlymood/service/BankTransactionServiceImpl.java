package io.explains.myonlymood.service;

import io.explains.myonlymood.model.BankTransaction;
import io.explains.myonlymood.repository.BankTransactionRepository;
import io.explains.myonlymood.service.CRUD.IBankTransactionCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BankTransactionServiceImpl extends RestrictCrudServiceImpl<BankTransaction, Long> implements IBankTransactionCrud {

    private final BankTransactionRepository repository;

    public BankTransactionServiceImpl(BankTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<BankTransaction, Long> getRepository() {
        return repository;
    }

}
