package com.Alexis.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataApplication {


	/*
	Webserviceprojekt for booking a deilvery time to warehouse
	(Future: frontend solution for user to request time, for admin to see/handle times)



	What models do I need?:
	Company(what company is delivering) - Can have many
	Product(What products are they delivering)
	Location(What port are they delivering to)
	Booking(Core model)

	setup pga database


	 */
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

}
