package io.explains.myonlymood.controller.NonEssential;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.NonEssential.ActivesDTO;
import io.explains.myonlymood.model.NonEssential.Actives;
import io.explains.myonlymood.service.CRUD.NonEssential.IActivesCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Actives")
public class ActivesController extends RestrictCrudController<Actives, ActivesDTO,Long> {

    private final IActivesCrud service;

    private final ModelMapper modelMapper;

    public ActivesController(IActivesCrud service, ModelMapper modelMapper) {
        super(Actives.class, ActivesDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<Actives, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
