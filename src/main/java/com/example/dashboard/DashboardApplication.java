package com.example.dashboard;

<<<<<<< HEAD
import com.example.dashboard.entities.*;
import com.example.dashboard.repositories.*;
=======
import com.example.dashboard.entities.Categoria;
import com.example.dashboard.entities.DetallePedido;
import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.CategoriaRepository;
import com.example.dashboard.repositories.DetallePedidoRepository;
import com.example.dashboard.repositories.EmpresaRepository;
import com.example.dashboard.repositories.SucursalRepository;
>>>>>>> 5781b3c2c7fda100b46e7a5e38c2c5eab211a6f9

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

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private SucursalRepository sucursalRepository;

	@Autowired
	private PromocionRepository promocionRepository;

	@Autowired
	private ImagenPromocionRepository imagenPromocionRepository;

	@Autowired
	private ArticuloRepository articuloRepository;
	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(EmpresaRepository empresaRepository, SucursalRepository sucursalRepository, PromocionRepository promocionRepository) {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			// Crear una instancia de Empresa
			Empresa empresa = Empresa.builder()
					.nombre("Mi Empresa")
					.razonSocial("Razón Social de Mi Empresa")
					.cuil(123456789)
					.build();

			// Guardar la empresa en la base de datos
			empresaRepository.save(empresa);

			logger.info("Alta de empresa completada");

			// Crear una instancia de Sucursal y asignarle la empresa creada
			Sucursal sucursal = Sucursal.builder()
					.nombre("Sucursal 1")
					.horarioApertura(LocalTime.of(9, 0))
					.horarioCierre(LocalTime.of(18, 0))
					.empresa(empresa)
					.build();

			// Guardar la sucursal en la base de datos
			sucursalRepository.save(sucursal);

			logger.info("Alta de sucursal completada");

			// Crear una instancia de Promoción
			Promocion promocion = Promocion.builder()
					.denominacion("Promoción de apertura")
					.FechaDesde(LocalDate.now())
					.FechaHasta(LocalDate.now().plusMonths(1))
					.HoraDesde(LocalTime.of(9, 0))
					.HoraHasta(LocalTime.of(18, 0))
					.descripcionDescuento("Descuento especial de apertura")
					.precioPromocional(50.0)
					.tipoPromocion(Promocion.TipoPromocion.DESCUENTO)
					.build();

			// Agregar la sucursal a la lista de sucursales de la promoción
			promocion.setSucursales(Arrays.asList(sucursal));

			// Guardar la promoción en la base de datos
			promocionRepository.save(promocion);

			logger.info("Alta de promoción completada");

			// Crear una instancia de ArticuloInsumo
			ArticuloInsumo articuloInsumo = ArticuloInsumo.builder()
					.precioCompra(50.0)
					.stockActual(100)
					.stockMaximo(200)
					.esParaElaborar(true)
					.build();

			// Guardar el artículo insumo en la base de datos
			articuloInsumoRepository.save(articuloInsumo);

			logger.info("Alta de artículo insumo completada");

			// Crear una instancia de Articulo
			Articulo articulo = Articulo.builder()
					.denominacion("Articulo 1")
					.precioVenta(100.0)
					.articuloInsumo(articuloInsumo) // Asignar el ArticuloInsumo al Articulo
					.build();

			// Guardar el artículo en la base de datos
			articuloRepository.save(articulo);

			logger.info("Alta de artículo completada");


			logger.info("Alta de artículo completada");

			// Crear una instancia de ImagenPromocion y asignarle la promoción y el artículo
			ImagenPromocion imagenPromocion = ImagenPromocion.builder()
					.denominacion("Imagen Promoción 1")
					.promocion(promocion)
					.articulo(articulo)
					.build();

			// Guardar la imagen de la promoción en la base de datos
			imagenPromocionRepository.save(imagenPromocion);

			logger.info("Alta de imagen de promoción completada");

		};
	}
	
}
