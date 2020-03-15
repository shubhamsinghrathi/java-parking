package com.indi.parking.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CarTest {

	Car car;
	Color color;
	RegistrationNumber registrationNumber;
	
	@BeforeEach
	void init() {
		car = new Car();
		color = new Color();
		registrationNumber = new RegistrationNumber();
	}
	
	@Test
	void testCar() {
		//
	}
	
}
