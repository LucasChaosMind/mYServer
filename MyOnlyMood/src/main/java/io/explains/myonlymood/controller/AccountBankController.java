package io.explains.myonlymood.controller;


import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.AccountBankDTO;
import io.explains.myonlymood.model.AccountBank;
import io.explains.myonlymood.service.CRUD.IAccountBankCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("AccountBank")
public class AccountBankController extends RestrictCrudController<AccountBank, AccountBankDTO,Long> {

    private final IAccountBankCrud service;

    private final ModelMapper modelMapper;

    public AccountBankController(IAccountBankCrud service, ModelMapper modelMapper) {
        super(AccountBank.class, AccountBankDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService< AccountBank, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
