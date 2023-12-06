package io.explains.myonlymood.service;

import io.explains.myonlymood.model.BankActiveCategory;
import io.explains.myonlymood.repository.BankActiveCategoryRepository;
import io.explains.myonlymood.service.CRUD.IBankActiveCategoryCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BankActiveCategoryServiceImpl extends RestrictCrudServiceImpl<BankActiveCategory, Long> implements IBankActiveCategoryCrud {

    private final BankActiveCategoryRepository repository;

    public BankActiveCategoryServiceImpl(BankActiveCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<BankActiveCategory, Long> getRepository() {
        return repository;
    }

}
