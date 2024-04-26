package com.example.dashboard;

import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.EmpresaRepository;
import com.example.dashboard.repositories.SucursalRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.logging.Logger;

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
	CommandLineRunner init() {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			// Crear la empresa
			Empresa empresa = Empresa.builder().nombre("Empresa 1").build();

			// Crear las sucursales
			Sucursal sucursal1 = Sucursal.builder().nombre("Sucursal 1").build();
			Sucursal sucursal2 = Sucursal.builder().nombre("Sucursal 2").build();

			// Establecer la relación bidireccional entre la empresa y las sucursales
			empresa.setSucursales(Arrays.asList(sucursal1, sucursal2));
			sucursal1.setEmpresa(empresa);
			sucursal2.setEmpresa(empresa);

			// Guardar la empresa en la base de datos
			empresaRepository.save(empresa);

			logger.info("Alta de empresa y sucursales completada");
		};
	}


}
