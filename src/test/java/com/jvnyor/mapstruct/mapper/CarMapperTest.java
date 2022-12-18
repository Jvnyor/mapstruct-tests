package com.jvnyor.mapstruct.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.jvnyor.mapstruct.model.dto.CarDTO;
import com.jvnyor.mapstruct.model.entity.Car;

@ExtendWith(SpringExtension.class)
class CarMapperTest {

    private CarMapper carMapper;
    private Car car;
    private CarDTO carDTO;

    @BeforeEach
    void setUp() {
        carMapper = CarMapper.INSTANCE;
        car = Car.builder()
                .id(1)
                .name("BMW")
                .build();
        carDTO = CarDTO.builder()
                .id(1)
                .name("BMW")
                .build();
    }

    @Test
    void carToCarDTO() {
        CarDTO carToCarDTO = carMapper.carToCarDTO(car);
        assertEquals(carToCarDTO, carDTO);
        assertEquals(carToCarDTO.getId(), carDTO.getId());
        assertEquals(carToCarDTO.getName(), carDTO.getName());
    }

    @Test
    void carDTOToCar() {
        Car carDTOToCar = carMapper.carDTOToCar(carDTO);
        assertEquals(carDTOToCar, car);
        assertEquals(carDTOToCar.getId(), car.getId());
        assertEquals(carDTOToCar.getName(), car.getName());
    }
}