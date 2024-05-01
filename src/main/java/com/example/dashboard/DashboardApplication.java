package com.example.dashboard;

import com.example.dashboard.entities.*;
import com.example.dashboard.entities.enums.TipoPromocion;
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

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(EmpresaRepository empresaRepository, SucursalRepository sucursalRepository, PromocionRepository promocionRepository) {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");
// Etapa del dashboard
			// Crear 1 pais
			// Crear 2 provincias para ese pais
			// crear 2 localidades para cada provincia

			Empresa empresaBrown = Empresa.builder().nombre("Lo de Brown").cuil(30503167).razonSocial("Venta de Alimentos").build();
			Sucursal sucursalChacras = Sucursal.builder().nombre("En chacras").horarioApertura(LocalTime.of(17,0)).horarioCierre(LocalTime.of(23,0)).build();
			Sucursal sucursalGodoyCruz = Sucursal.builder().nombre("En godoy cruz").horarioApertura(LocalTime.of(16,0)).horarioCierre(LocalTime.of(23,30)).build();


			empresaBrown.getSucursales().add(sucursalChacras);
			empresaBrown.getSucursales().add(sucursalGodoyCruz);

			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);
			empresaRepository.save(empresaBrown);

			// Crear Unidades de medida


			// Crear Categorías de productos y subCategorías de los mismos


			// Crear Insumos , coca cola , harina , etc
//			ArticuloInsumo cocaCola = ArticuloInsumo.builder().denominacion("Coca cola").unidadMedida(unidadMedidaLitros).esParaElaborar(false).stockActual(5).stockMaximo(50).precioCompra(50.0).precioVenta(70.0).build();
//			ArticuloInsumo harina = ArticuloInsumo.builder().denominacion("Harina").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(4).stockMaximo(40).precioCompra(40.0).precioVenta(60.5).build();
//			ArticuloInsumo queso = ArticuloInsumo.builder().denominacion("Queso").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).build();
//			ArticuloInsumo tomate = ArticuloInsumo.builder().denominacion("Tomate").unidadMedida(unidadMedidaCantidad).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).build();

			// crear fotos para cada insumo
			ImagenPromocion imagenCoca = ImagenPromocion.builder().denominacion("https://m.media-amazon.com/images/I/51v8nyxSOYL._SL1500_.jpg").build();
			ImagenPromocion imagenHarina = ImagenPromocion.builder().denominacion("https://mandolina.co/wp-content/uploads/2023/03/648366622-1024x683.jpg").build();
			ImagenPromocion imagenQueso = ImagenPromocion.builder().denominacion("https://superdepaso.com.ar/wp-content/uploads/2021/06/SANTAROSA-PATEGRAS-04.jpg").build();
			ImagenPromocion imagenTomate = ImagenPromocion.builder().denominacion("https://thefoodtech.com/wp-content/uploads/2020/06/Componentes-de-calidad-en-el-tomate-828x548.jpg").build();
			imagenPromocionRepository.save(imagenCoca);
			imagenPromocionRepository.save(imagenHarina);
			imagenPromocionRepository.save(imagenQueso);
			imagenPromocionRepository.save(imagenTomate);

//			cocaCola.getImagenPromociones().add(imagenCoca);
//			harina.getImagenPromociones().add(imagenHarina);
//			queso.getImagenPromociones().add(imagenQueso);
//			tomate.getImagenPromociones().add(imagenTomate);
//			articuloInsumoRepository.save(cocaCola);
//			articuloInsumoRepository.save(harina);
//			articuloInsumoRepository.save(queso);
//			articuloInsumoRepository.save(tomate);

			// Crear Articulos Manufacturados
//			ArticuloManufacturado pizzaMuzarella = ArticuloManufacturado.builder().denominacion("Pizza Muzarella").descripcion("Una pizza clasica").unidadMedida(unidadMedidaPorciones).precioVenta(130.0).tiempoEstimadoMinutos(15).preparacion("Pasos de preparacion de una muzza de toda la vida").build();
//			ArticuloManufacturado pizzaNapolitana = ArticuloManufacturado.builder().denominacion("Pizza Muzarella").descripcion("Una pizza clasica").unidadMedida(unidadMedidaPorciones).precioVenta(150.0).tiempoEstimadoMinutos(15).preparacion("Pasos de preparacion de una pizza napolitana italiana").build();

			// Crear fotos para los artículos manufacturados
			ImagenPromocion imagenPizzaMuzarella = ImagenPromocion.builder().denominacion("https://storage.googleapis.com/fitia-api-bucket/media/images/recipe_images/1002846.jpg").build();
			ImagenPromocion imagenPizzaNapolitana = ImagenPromocion.builder().denominacion("https://assets.elgourmet.com/wp-content/uploads/2023/03/8metlvp345_portada-pizza-1024x686.jpg.webp").build();
			imagenPromocionRepository.save(imagenPizzaMuzarella);
			imagenPromocionRepository.save(imagenPizzaNapolitana);
//
//			pizzaMuzarella.getImagenPromociones().add(imagenPizzaMuzarella);
//			pizzaNapolitana.getImagenPromociones().add(imagenPizzaNapolitana);
//			articuloManufacturadoRepository.save(pizzaMuzarella);
//			articuloManufacturadoRepository.save(pizzaNapolitana);

			// Establecer las relaciones entre estos objetos.
//			ArticuloManufacturadoDetalle detalle1 = ArticuloManufacturadoDetalle.builder().articuloInsumo(harina).cantidad(300).build();
//			ArticuloManufacturadoDetalle detalle2 = ArticuloManufacturadoDetalle.builder().articuloInsumo(queso).cantidad(600).build();
//			ArticuloManufacturadoDetalle detalle3 = ArticuloManufacturadoDetalle.builder().articuloInsumo(harina).cantidad(350).build();
//			ArticuloManufacturadoDetalle detalle4 = ArticuloManufacturadoDetalle.builder().articuloInsumo(queso).cantidad(650).build();
//			ArticuloManufacturadoDetalle detalle5 = ArticuloManufacturadoDetalle.builder().articuloInsumo(tomate).cantidad(2).build();
//
//			pizzaMuzarella.getArticuloManufacturadoDetalles().add(detalle1);
//			pizzaMuzarella.getArticuloManufacturadoDetalles().add(detalle2);
//			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle3);
//			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle4);
//			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle5);


			// Establecer relaciones de las categorias


			// Crear promocion para sucursal - Dia de los enamorados
			// Tener en cuenta que esa promocion es exclusivamente para una sucursal determinada d euna empresa determinada
			Promocion promocionDiaEnamorados = Promocion.builder().denominacion("Dia de los Enamorados")
					.fechaDesde(LocalDate.of(2024,2,13))
					.fechaHasta(LocalDate.of(2024,2,15))
					.horaDesde(LocalTime.of(0,0))
					.horaHasta(LocalTime.of(23,59))
					.descripcionDescuento("El descuento que se hace por san valentin, un dia antes y un dia despues")
					.precioPromocional(100.0)
					.tipoPromocion(TipoPromocion.promocion)
					.build();
//			promocionDiaEnamorados.getArticulos().add(cocaCola);
//			promocionDiaEnamorados.getArticulos().add(pizzaNapolitana);
			promocionRepository.save(promocionDiaEnamorados);

			//Agregar categorias y promociones a sucursales
//			sucursalChacras.getCategorias().add(categoriaBebidas);
//			sucursalChacras.getCategorias().add(categoriaPizzas);
			sucursalChacras.getPromociones().add(promocionDiaEnamorados);

//			sucursalGodoyCruz.getCategorias().add(categoriaBebidas);
//			sucursalGodoyCruz.getCategorias().add(categoriaPizzas);

			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);

			//Crea un cliente y un usuario


			logger.info("----------------Sucursal Chacras ---------------------");
			logger.info("{}",sucursalChacras);
			logger.info("----------------Sucursal Godoy Cruz ---------------------");
			logger.info("{}",sucursalGodoyCruz);
			logger.info("----------------Pedido ---------------------");


		};
	}
}
