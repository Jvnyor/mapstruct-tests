package com.jvnyor.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jvnyor.mapstruct.model.dto.CustomerDto;
import com.jvnyor.mapstruct.model.entity.Customer;

@Mapper
public interface CustomerDtoMapper {

    @Mapping(source = "firstName", target = "forename")
    @Mapping(source = "lastName", target = "surname")
    CustomerDto from(Customer customer);

}