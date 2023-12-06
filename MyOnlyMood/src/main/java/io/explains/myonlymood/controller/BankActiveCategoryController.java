package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.BankActiveCategoryDTO;
import io.explains.myonlymood.dto.BankTransactionDTO;
import io.explains.myonlymood.model.BankActiveCategory;
import io.explains.myonlymood.model.BankTransaction;
import io.explains.myonlymood.service.CRUD.IBankActiveCategoryCrud;
import io.explains.myonlymood.service.CRUD.IBankTransactionCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BankActive")
public class BankActiveCategoryController extends RestrictCrudController<BankActiveCategory, BankActiveCategoryDTO,Long> {

    private final IBankActiveCategoryCrud service;

    private final ModelMapper modelMapper;

    public BankActiveCategoryController(IBankActiveCategoryCrud service, ModelMapper modelMapper) {
        super(BankActiveCategory.class, BankActiveCategoryDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<BankActiveCategory, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
