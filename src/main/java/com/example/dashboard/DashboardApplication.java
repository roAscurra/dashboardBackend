package com.example.dashboard;

import com.example.dashboard.entities.*;
import com.example.dashboard.entities.enums.Estado;
import com.example.dashboard.entities.enums.FormaPago;
import com.example.dashboard.entities.enums.TipoEnvio;
import com.example.dashboard.entities.enums.TipoPromocion;
import com.example.dashboard.repositories.*;
import com.example.dashboard.entities.Empresa;
import com.example.dashboard.entities.Sucursal;
import com.example.dashboard.repositories.EmpresaRepository;
import com.example.dashboard.repositories.SucursalRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
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

	@Autowired
	private DomicilioRepository domicilioRepository;

	@Autowired
	private LocalidadRepository localidadRepository;

	@Autowired
	private ProvinciaRepository provinciaRepository;

	@Autowired
	private PaisRepository paisRepository;

	@Autowired
	private ImagenClienteRepository imagenClienteRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private DetallePedido detallePedido;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

	@Bean
	CommandLineRunner init(EmpresaRepository empresaRepository,
						   SucursalRepository sucursalRepository,
						   PromocionRepository promocionRepository,
						   DomicilioRepository domicilioRepository,
						   LocalidadRepository localidadRepository,
						   ProvinciaRepository provinciaRepository,
						   PaisRepository paisRepository,
						   UsuarioRepository usuarioRepository,
						   ImagenClienteRepository imagenClienteRepository,
						   DetallePedidoRepository detallePedidoRepository,
						   CategoriaRepository categoriaRepository,
						   ArticuloRepository articuloRepository,
						   PedidoRepository pedidoRepository,
						   FacturaRepository facturaRepository,
						   ArticuloManufacturadoRepository articuloManufacturadoRepository,
						   ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
						   UnidadMedidaRepository unidadMedidaRepository,
						   ClienteRepository clienteRepository) {

		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			//Crear instancia pais
			Pais pais = Pais.builder().nombre("Argentina").build();

			//Crear instancias provincias
			Provincia provincia1 = Provincia.builder().nombre("Mendoza").pais(pais).build();
			Provincia provincia2 = Provincia.builder().nombre("Cordoba").pais(pais).build();

			//Crear instancias localidades
			Localidad localidad1 = Localidad.builder().nombre("Guaymallen").provincia(provincia1).build();
			Localidad localidad2 = Localidad.builder().nombre("Godoy Cruz").provincia(provincia1).build();
			Localidad localidad3 = Localidad.builder().nombre("Lujan de Cuyo").provincia(provincia1).build();

			paisRepository.save(pais);
			provinciaRepository.save(provincia1);
			provinciaRepository.save(provincia2);
			localidadRepository.save(localidad1);
			localidadRepository.save(localidad2);
			localidadRepository.save(localidad3);


			Empresa empresaBrown = Empresa.builder().nombre("Lo de Brown").cuil(30503167).razonSocial("Venta de Alimentos").build();
			Sucursal sucursalChacras = Sucursal.builder().nombre("En chacras").horarioApertura(LocalTime.of(17,0)).horarioCierre(LocalTime.of(23,0)).build();
			Sucursal sucursalGodoyCruz = Sucursal.builder().nombre("En godoy cruz").horarioApertura(LocalTime.of(16,0)).horarioCierre(LocalTime.of(23,30)).build();

			//Crear instancias domicilio
			Domicilio domicilioGodoyCruz = Domicilio.builder()
					.calle("Av. San Martin")
					.numero(1234)
					.cp(5501)
					.piso(5)
					.nroDpto(2)
					.localidad(localidad2)
					.build();

			Domicilio domicilioChacras = Domicilio.builder()
					.calle("Mitre")
					.numero(1634)
					.cp(5505)
					.piso(0)
					.nroDpto(0)
					.localidad(localidad3)
					.build();

			Domicilio domicilioCliente = Domicilio.builder()
					.calle("comodoro rivadavia")
					.numero(1470)
					.cp(5519)
					.piso(0)
					.nroDpto(0)
					.localidad(localidad1)
					.build();

			sucursalChacras.setDomicilio(domicilioChacras);
			sucursalGodoyCruz.setDomicilio(domicilioGodoyCruz);
			empresaBrown.getSucursales().add(sucursalChacras);
			empresaBrown.getSucursales().add(sucursalGodoyCruz);

			domicilioRepository.save(domicilioChacras);
			domicilioRepository.save(domicilioGodoyCruz);
			domicilioRepository.save(domicilioCliente);
			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);
			empresaRepository.save(empresaBrown);

			// Crear Unidades de medida
			UnidadMedida unidadMedidaKilo = UnidadMedida.builder()
					.denominacion("kilo")
					.build();

			UnidadMedida unidadMedidaGramos = UnidadMedida.builder()
					.denominacion("gramos")
					.build();

			UnidadMedida unidadMedidaLitros = UnidadMedida.builder()
					.denominacion("Litros")
					.build();

			UnidadMedida unidadMedidaPorcion = UnidadMedida.builder()
					.denominacion("Porcion")
					.build();

			unidadMedidaRepository.save(unidadMedidaKilo);
			unidadMedidaRepository.save(unidadMedidaGramos);
			unidadMedidaRepository.save(unidadMedidaLitros);
			unidadMedidaRepository.save(unidadMedidaPorcion);

			//Craer Articulo

			Articulo pizza = Articulo.builder()
					.denominacion("Pizza")
					.precioVenta(7000.00)
					.build();

			Articulo talca = Articulo.builder()
					.denominacion("Pepsi")
					.precioVenta(2700.00)
					.build();

			Articulo hamburguesa = Articulo.builder()
					.denominacion("Hamburguesa")
					.precioVenta(5500.00)
					.build();

			//Relacion Articulo-UnidadMedida
			pizza.setUnidadMedida(unidadMedidaPorcion);
			talca.setUnidadMedida(unidadMedidaLitros);
			hamburguesa.setUnidadMedida(unidadMedidaKilo);

			articuloRepository.save(pizza);
			articuloRepository.save(talca);
			articuloRepository.save(hamburguesa);

			// Crear Categorías de productos y subCategorías de los mismos
			Categoria categoria1 = Categoria.builder()
					.denominacion("Pizzas")
					.build();

			Categoria categoria2 = Categoria.builder()
					.denominacion("Bebidas")
					.build();

			categoria1.getArticulos().add(pizza);
			categoria2.getArticulos().add(talca);
			categoriaRepository.save(categoria1);
			categoriaRepository.save(categoria2);

			// Crear instancias de DetallePedido
			DetallePedido detallePedido1 = DetallePedido.builder()
					.cantidad(15)
					.subTotal(500.0)
					.build();

			DetallePedido detallePedido2 = DetallePedido.builder()
					.cantidad(20)
					.subTotal(700.0)
					.build();



			detallePedidoRepository.save(detallePedido1);
			detallePedidoRepository.save(detallePedido2);

			categoria1.getSubCategoria().add(categoria2);
			categoriaRepository.save(categoria1);



			// Crear Insumos , coca cola , harina , etc
			ArticuloInsumo cocaCola = ArticuloInsumo.builder().denominacion("Coca cola").unidadMedida(unidadMedidaLitros).esParaElaborar(false).stockActual(5).stockMaximo(50).precioCompra(50.0).precioVenta(70.0).build();
			ArticuloInsumo harina = ArticuloInsumo.builder().denominacion("Harina").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(4).stockMaximo(40).precioCompra(40.0).precioVenta(60.5).build();
			ArticuloInsumo queso = ArticuloInsumo.builder().denominacion("Queso").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).build();
			ArticuloInsumo tomate = ArticuloInsumo.builder().denominacion("Tomate").unidadMedida(unidadMedidaKilo).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).build();



			articuloInsumoRepository.save(cocaCola);
			articuloInsumoRepository.save(harina);
			articuloInsumoRepository.save(queso);
			articuloInsumoRepository.save(tomate);

			// creando fotos
			ImagenPromocion imagenCoca = ImagenPromocion.builder().denominacion("https://m.media-amazon.com/images/I/51v8nyxSOYL._SL1500_.jpg").build();
			ImagenPromocion imagenHarina = ImagenPromocion.builder().denominacion("https://mandolina.co/wp-content/uploads/2023/03/648366622-1024x683.jpg").build();
			ImagenPromocion imagenQueso = ImagenPromocion.builder().denominacion("https://superdepaso.com.ar/wp-content/uploads/2021/06/SANTAROSA-PATEGRAS-04.jpg").build();
			ImagenPromocion imagenTomate = ImagenPromocion.builder().denominacion("https://thefoodtech.com/wp-content/uploads/2020/06/Componentes-de-calidad-en-el-tomate-828x548.jpg").build();
			imagenPromocionRepository.save(imagenCoca);
			imagenPromocionRepository.save(imagenHarina);
			imagenPromocionRepository.save(imagenQueso);
			imagenPromocionRepository.save(imagenTomate);


			//Creando Insumo
			cocaCola.getImagenPromociones().add(imagenCoca);
			harina.getImagenPromociones().add(imagenHarina);
			queso.getImagenPromociones().add(imagenQueso);
			tomate.getImagenPromociones().add(imagenTomate);
			articuloInsumoRepository.save(cocaCola);
			articuloInsumoRepository.save(harina);
			articuloInsumoRepository.save(queso);
			articuloInsumoRepository.save(tomate);


			// Crear Articulos Manufacturados
			ArticuloManufacturado pizzaMuzarella = ArticuloManufacturado.builder().denominacion("Pizza Muzarella").descripcion("Una pizza clasica").unidadMedida(unidadMedidaPorcion).precioVenta(130.0).tiempoEstimadoMinutos(15).preparacion("Pasos de preparacion de una muzza de toda la vida").build();
			ArticuloManufacturado pizzaNapolitana = ArticuloManufacturado.builder().denominacion("Pizza Napolitana").descripcion("Una pizza clasica").unidadMedida(unidadMedidaPorcion).precioVenta(150.0).tiempoEstimadoMinutos(15).preparacion("Pasos de preparacion de una pizza napolitana italiana").build();



			// Establecer las relaciones entre estos objetos.
			ArticuloManufacturadoDetalle detalle1 = ArticuloManufacturadoDetalle.builder().articuloInsumo(harina).cantidad(300).build();
			ArticuloManufacturadoDetalle detalle2 = ArticuloManufacturadoDetalle.builder().articuloInsumo(queso).cantidad(600).build();
			ArticuloManufacturadoDetalle detalle3 = ArticuloManufacturadoDetalle.builder().articuloInsumo(harina).cantidad(350).build();
			ArticuloManufacturadoDetalle detalle4 = ArticuloManufacturadoDetalle.builder().articuloInsumo(queso).cantidad(650).build();
			ArticuloManufacturadoDetalle detalle5 = ArticuloManufacturadoDetalle.builder().articuloInsumo(tomate).cantidad(2).build();

			pizzaMuzarella.getArticuloManufacturadoDetalles().add(detalle1);
			pizzaMuzarella.getArticuloManufacturadoDetalles().add(detalle2);
			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle3);
			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle4);
			pizzaNapolitana.getArticuloManufacturadoDetalles().add(detalle5);


			articuloManufacturadoDetalleRepository.save(detalle1);
			articuloManufacturadoDetalleRepository.save(detalle2);
			articuloManufacturadoDetalleRepository.save(detalle3);
			articuloManufacturadoDetalleRepository.save(detalle4);
			articuloManufacturadoDetalleRepository.save(detalle5);




			// Crear fotos para los artículos manufacturados
			ImagenPromocion imagenPizzaMuzarella = ImagenPromocion.builder().denominacion("https://storage.googleapis.com/fitia-api-bucket/media/images/recipe_images/1002846.jpg").build();
			ImagenPromocion imagenPizzaNapolitana = ImagenPromocion.builder().denominacion("https://assets.elgourmet.com/wp-content/uploads/2023/03/8metlvp345_portada-pizza-1024x686.jpg.webp").build();



			imagenPromocionRepository.save(imagenPizzaMuzarella);
			imagenPromocionRepository.save(imagenPizzaNapolitana);

			pizzaMuzarella.getImagenPromociones().add(imagenPizzaMuzarella);
			pizzaNapolitana.getImagenPromociones().add(imagenPizzaNapolitana);
			articuloManufacturadoRepository.save(pizzaMuzarella);
			articuloManufacturadoRepository.save(pizzaNapolitana);


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

			promocionDiaEnamorados.getArticulos().add(pizza);
			promocionDiaEnamorados.getArticulos().add(talca);
			promocionDiaEnamorados.getArticulos().add(cocaCola);
			promocionDiaEnamorados.getArticulos().add(pizzaNapolitana);
			promocionRepository.save(promocionDiaEnamorados);


			//Crear Factura

			Factura factura1 = Factura.builder()
					.fechaFacturacion(LocalDate.of(2024,1,10))
					.mpPaymentId(1)
					.mpMerchantOrderId(1)
					.mpPreferenceId("1")
					.mpPaymentType("1")
					.formaPago(FormaPago.MercadoPago)
					.totalVenta(10.0)
					.build();

			facturaRepository.save(factura1);


			//Crear Pedido

			Pedido pedido1 = Pedido.builder()
					.horaEstimadaFinalizacion(LocalTime.of(15, 30))
					.total(22500.00)
					.totalCosto(35000.00)
					.estado(Estado.entregado)
					.tipoEnvio(TipoEnvio.TakeAway)
					.formaPago(FormaPago.MercadoPago)
					.FechaPedido(LocalDate.of(2024,1,10))
					.build();

			pedido1.setDomicilio(domicilioGodoyCruz);
			pedido1.setSucursal(sucursalGodoyCruz);
			pedido1.setFactura(factura1);
			pedido1.getDetallePedidos().add(detallePedido1);

			pedidoRepository.save(pedido1);

			//Agregar categorias y promociones a sucursales
			sucursalChacras.getCategorias().add(categoria1);
			sucursalChacras.getCategorias().add(categoria2);
			sucursalChacras.getPromociones().add(promocionDiaEnamorados);

			sucursalGodoyCruz.getCategorias().add(categoria1);
			sucursalGodoyCruz.getCategorias().add(categoria2);

			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);

			//Crea un cliente y un usuario
			ImagenCliente imagenCliente = ImagenCliente.builder().denominacion("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr9cSuAFVgr3rFGMkYgMQ6GDXP1Hy-Cp0Ox9GysWr-gg&s").build();
			imagenClienteRepository.save(imagenCliente);

			Usuario usuario = Usuario.builder().auth0Id("auth0|abcdef1234567890").build();
			usuarioRepository.save(usuario);

			Cliente cliente1 = Cliente.builder()
					.nombre("pepito")
					.apellido("perez")
					.telefono("23462452")
					.email("pepitoperez@gmail.com")
					.fechaNacimiento(LocalDate.of(2001,10,8))
					.imagenCliente(imagenCliente)
					.usuario(usuario)
					.build();

			cliente1.getDomicilios().add(domicilioCliente);
			cliente1.getPedidos().add(pedido1);

			logger.info("----------------Sucursal Chacras ---------------------");
			logger.info("{}",sucursalChacras);
			logger.info("----------------Sucursal Godoy Cruz ---------------------");
			logger.info("{}",sucursalGodoyCruz);
			logger.info("----------------Pedido ---------------------");


		};
	}
}
