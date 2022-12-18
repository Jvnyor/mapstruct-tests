package com.jvnyor.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.jvnyor.mapstruct.model.entity.Address;
import com.jvnyor.mapstruct.model.entity.Customer;
import com.jvnyor.mapstruct.model.entity.DeliveryAddress;

@Mapper
public interface DeliveryAddressMapper {
	DeliveryAddressMapper INSTANCE = Mappers.getMapper(DeliveryAddressMapper.class);
	
	@Mapping(source = "customer.firstName", target = "forename")
    @Mapping(source = "customer.lastName", target = "surname")
    @Mapping(source = "address.street", target = "street")
    @Mapping(source = "address.postalcode", target = "postalcode")
    @Mapping(source = "address.county", target = "county")
    DeliveryAddress from(Customer customer, Address address);
	
	@Mapping(source = "address.postalcode", target = "postalcode")
    @Mapping(source = "address.county", target = "county")
    DeliveryAddress updateAddress(@MappingTarget DeliveryAddress deliveryAddress, Address address);
}
