package com.jvnyor.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jvnyor.mapstruct.model.dto.CarDTO;
import com.jvnyor.mapstruct.model.entity.Car;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDTO carToCarDTO(Car car);
    Car carDTOToCar(CarDTO carDTO);
}