package com.devsuperior.desafiocrudclientes;

import com.devsuperior.desafiocrudclientes.entities.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class DesafiocrudclientesApplication {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		SpringApplication.run(DesafiocrudclientesApplication.class, args);

		Client client = new Client(1L, "Walter", "058.964.789-20", 3200.00, LocalDate.of(1992, 07, 10), 3);
		System.out.println(client);
	}

}
