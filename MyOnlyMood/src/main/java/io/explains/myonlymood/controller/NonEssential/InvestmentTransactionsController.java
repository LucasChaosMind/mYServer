package io.explains.myonlymood.controller.NonEssential;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;

import io.explains.myonlymood.dto.NonEssential.InvestmentTransactionsDTO;

import io.explains.myonlymood.model.NonEssential.InvestmentTransactions;
import io.explains.myonlymood.service.CRUD.NonEssential.IInvestmentTransactionsCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("InvestmentTransactions")
public class InvestmentTransactionsController extends RestrictCrudController<InvestmentTransactions, InvestmentTransactionsDTO,Long> {

    private final IInvestmentTransactionsCrud service;

    private final ModelMapper modelMapper;

    public InvestmentTransactionsController(IInvestmentTransactionsCrud service, ModelMapper modelMapper) {
        super(InvestmentTransactions.class, InvestmentTransactionsDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<InvestmentTransactions, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
