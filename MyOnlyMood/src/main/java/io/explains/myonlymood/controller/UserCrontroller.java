package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;

import io.explains.myonlymood.dto.UserAccountDTO;
import io.explains.myonlymood.model.UserAccount;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import io.explains.myonlymood.service.CRUD.IUserCrud;
import io.explains.myonlymood.shared.GenericResponse;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("UserAccount")
public class UserCrontroller extends RestrictCrudController<UserAccount, UserAccountDTO,Long> {

    private final IUserCrud service;

    private final ModelMapper modelMapper;

    public UserCrontroller(IUserCrud service, ModelMapper modelMapper) {
        super(UserAccount.class, UserAccountDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }


    @Override
    protected IRestrictCrudService<UserAccount, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
