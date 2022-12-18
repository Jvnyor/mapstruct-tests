package com.jvnyor.mapstruct.model.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
public class CarDTO {
    private int id;
    private String name;
}