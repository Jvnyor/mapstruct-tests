package com.jvnyor.mapstruct.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String street;
    private String postalcode;
    private String county;

}