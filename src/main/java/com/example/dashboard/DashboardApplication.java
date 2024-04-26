package com.example.dashboard;

import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.EmpresaRepository;
import com.example.dashboard.repositories.SucursalRepository;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.Arrays;


@SpringBootApplication
public class DashboardApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(DashboardApplication.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private SucursalRepository sucursalRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(EmpresaRepository empresaRepository, SucursalRepository sucursalRepository) {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			// Crear una instancia de Empresa
			Empresa empresa = Empresa.builder()
					.nombre("Mi Empresa")
					.razonSocial("Razón Social de Mi Empresa")
					.cuil(123456789)
					.build();

			// Crear instancias de Sucursal
			Sucursal sucursal1 = Sucursal.builder()
					.nombre("Sucursal 1")
					.horarioApertura(LocalTime.of(9, 0))
					.horarioCierre(LocalTime.of(18, 0))
					.empresa(empresa)  // Establecer la relación con la empresa
					.build();

			Sucursal sucursal2 = Sucursal.builder()
					.nombre("Sucursal 2")
					.horarioApertura(LocalTime.of(8, 30))
					.horarioCierre(LocalTime.of(17, 30))
					.empresa(empresa)  // Establecer la relación con la empresa
					.build();

			// Establecer la relación inversa
			empresa.setSucursales(Arrays.asList(sucursal1, sucursal2));

			// Guardar la empresa y sus sucursales en la base de datos
			empresaRepository.save(empresa);

			logger.info("Alta de empresa y sucursales completada");
		};
	}

}
