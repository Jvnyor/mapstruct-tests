package com.jvnyor.mapstruct.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.jvnyor.mapstruct.model.entity.Address;
import com.jvnyor.mapstruct.model.entity.Customer;
import com.jvnyor.mapstruct.model.entity.DeliveryAddress;

@ExtendWith(SpringExtension.class)
class DeliveryAddressMapperTest {

	private DeliveryAddressMapper deliveryAddressMapper;

	@BeforeEach
    void setUp() {
		deliveryAddressMapper = DeliveryAddressMapper.INSTANCE;
    }
	
	@Test
	void testGivenCustomerAndAddress_mapsToDeliveryAddress() {
		Customer customer = new Customer();
		customer.setFirstName("Max");
		customer.setLastName("Powers");

		Address homeAddress = new Address();
		homeAddress.setStreet("123 Some Street");
		homeAddress.setCounty("Nevada");
		homeAddress.setPostalcode("89123");

		DeliveryAddress deliveryAddress = deliveryAddressMapper.from(customer, homeAddress);

		assertEquals(deliveryAddress.getForename(), customer.getFirstName());
		assertEquals(deliveryAddress.getSurname(), customer.getLastName());
		assertEquals(deliveryAddress.getStreet(), homeAddress.getStreet());
		assertEquals(deliveryAddress.getCounty(), homeAddress.getCounty());
		assertEquals(deliveryAddress.getPostalcode(), homeAddress.getPostalcode());
	}
	
	@Test
    public void testGivenDeliveryAddressAndSomeOtherAddress_updatesDeliveryAddress() {

        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setForename("Max");
        deliveryAddress.setSurname("Powers");
        deliveryAddress.setStreet("123 Some Street");
        deliveryAddress.setCounty("Nevada");
        deliveryAddress.setPostalcode("89123");

        Address newAddress = new Address();
        newAddress.setStreet("456 Some other street");
        newAddress.setCounty("Arizona");
        newAddress.setPostalcode("12345");

        DeliveryAddress updatedDeliveryAddress = deliveryAddressMapper.updateAddress(deliveryAddress, newAddress);

        assertSame(deliveryAddress, updatedDeliveryAddress);

        assertEquals(deliveryAddress.getStreet(), newAddress.getStreet());
        assertEquals(deliveryAddress.getCounty(), newAddress.getCounty());
        assertEquals(deliveryAddress.getPostalcode(), newAddress.getPostalcode());

    }

}
