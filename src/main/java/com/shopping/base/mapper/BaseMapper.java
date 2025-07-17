package com.shopping.base.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper()
public interface BaseMapper<T, DTO> {

    DTO toDto(T entity);

    T fromDto(DTO dto);

    T fromDto(@MappingTarget T t, DTO dto);

    List<DTO> toDto(List<T> t);

    List<T> fromDto(List<DTO> dto);


}
