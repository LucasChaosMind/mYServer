package io.explains.myonlymood.controller.NonEssential;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.NonEssential.InvestmentBrokerDTO;
import io.explains.myonlymood.model.NonEssential.InvestmentBroker;
import io.explains.myonlymood.service.CRUD.NonEssential.IInvestmentBrokerCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("InvestmentBroker")
public class InvestmentBrokerController extends RestrictCrudController<InvestmentBroker, InvestmentBrokerDTO,Long> {

    private final IInvestmentBrokerCrud service;

    private final ModelMapper modelMapper;

    public InvestmentBrokerController(IInvestmentBrokerCrud service, ModelMapper modelMapper) {
        super(InvestmentBroker.class, InvestmentBrokerDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<InvestmentBroker, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
