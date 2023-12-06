package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.BankTransactionDTO;

import io.explains.myonlymood.model.BankTransaction;

import io.explains.myonlymood.service.CRUD.IBankTransactionCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BankTrasaction")
public class BankTransactionController extends RestrictCrudController<BankTransaction, BankTransactionDTO,Long> {

    private final IBankTransactionCrud service;

    private final ModelMapper modelMapper;

    public BankTransactionController(IBankTransactionCrud service, ModelMapper modelMapper) {
        super(BankTransaction.class, BankTransactionDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<BankTransaction, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
