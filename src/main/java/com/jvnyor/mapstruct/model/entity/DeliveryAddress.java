package com.jvnyor.mapstruct.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryAddress {

    private String forename;
    private String surname;
    private String street;
    private String postalcode;
    private String county;

}