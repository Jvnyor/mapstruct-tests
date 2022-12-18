package com.jvnyor.mapstruct.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Car {
    private int id;
    private String name;
}