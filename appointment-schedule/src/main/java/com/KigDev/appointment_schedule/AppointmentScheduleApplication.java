package com.KigDev.appointment_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class AppointmentScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentScheduleApplication.class, args);

	}

}
