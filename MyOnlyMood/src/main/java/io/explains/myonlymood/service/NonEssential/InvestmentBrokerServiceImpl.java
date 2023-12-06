package io.explains.myonlymood.service.NonEssential;

import io.explains.myonlymood.model.NonEssential.InvestmentBroker;
import io.explains.myonlymood.repository.NonEssential.InvestmentBrokerRepository;
import io.explains.myonlymood.service.CRUD.NonEssential.IInvestmentBrokerCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InvestmentBrokerServiceImpl extends RestrictCrudServiceImpl<InvestmentBroker, Long> implements IInvestmentBrokerCrud {

    private final InvestmentBrokerRepository repository;

    public InvestmentBrokerServiceImpl(InvestmentBrokerRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<InvestmentBroker, Long> getRepository() {
        return repository;
    }


}
