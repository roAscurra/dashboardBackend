package com.example.dashboard;

import com.example.dashboard.entities.*;
import com.example.dashboard.repositories.*;
import com.example.dashboard.entities.Categoria;
import com.example.dashboard.entities.DetallePedido;
import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.CategoriaRepository;
import com.example.dashboard.repositories.DetallePedidoRepository;
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

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DashboardApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(DashboardApplication.class);

//	@Autowired
//	private EmpresaRepository empresaRepository;
//
//	@Autowired
//	private SucursalRepository sucursalRepository;
//
//	@Autowired
//	private PromocionRepository promocionRepository;
//
//	@Autowired
//	private ImagenPromocionRepository imagenPromocionRepository;
//
//	@Autowired
//	private ArticuloRepository articuloRepository;
//	@Autowired
//	private ArticuloInsumoRepository articuloInsumoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(EmpresaRepository empresaRepository, SucursalRepository sucursalRepository, PromocionRepository promocionRepository) {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");



		};
	}
}
