package com.jvnyor.mapstruct.model.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
public class Car {
    private int id;
    private String name;
}