package kodlama.io.hrms.core.mapper.abstracts;

import kodlama.io.hrms.entities.concretes.EntityWithUUID;


public interface BaseMapper <E extends EntityWithUUID , DTO> {

    E checkAndConvertToEntity(DTO dto);

    DTO checkAndConvertToDto(E entity);

    E convertToEntity(DTO dto);

    DTO convertToDto(E entity);

    E checkId(E entity , DTO model);

    DTO loadId(E entity , DTO model);

}
