package kodlama.io.hrms.core.mapper.impl;

import kodlama.io.hrms.core.mapper.BaseMapper;
import kodlama.io.hrms.entities.domain.EntityWithUUID;
import kodlama.io.hrms.entities.dto.BaseDto;

import java.util.UUID;

public abstract class BaseMapperImpl<E extends EntityWithUUID , DTO extends BaseDto> implements BaseMapper<E , DTO> {


    @Override
    public E checkAndConvertToEntity(DTO dto) {
        if(dto == null){
            return null ;
        }
        return checkId(convertToEntity(dto),dto);
    }

    @Override
    public DTO checkAndConvertToDto(E entity) {
        if(entity==null){
            return null;
        }
        return loadId(entity,convertToDto(entity));
    }

    @Override
    public E convertToEntity(DTO dto) {
        return null;
    }

    @Override
    public DTO convertToDto(E entity) {
        return null;
    }

    @Override
    public E checkId(E entity, DTO model) {
        entity.setId(model.getId()==null ? UUID.randomUUID() : UUID.fromString(model.getId()));
        return entity ;
    }


    @Override
    public DTO loadId(E entity, DTO model) {
        return null;
    }
}
