package com.cibertec.controlador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Categoria;
import com.cibertec.modelo.Producto;
import com.cibertec.modelo.ProductoViewModel;
import com.cibertec.repositorio.ICategoriaRepositorio;
import com.cibertec.repositorio.IProductoRepositorio;

@Controller
public class ProductoController {
	@Autowired
	private IProductoRepositorio productoRepositorio;

	@Autowired
	private ICategoriaRepositorio categoriaRepositorio;

	@GetMapping("/consultar")
	public String mostrarFormularioConsulta() {
		return "consulta";
	}

	@PostMapping("/consultar")
	public String consultaProductos(@RequestParam("descripcion")String descripcion,Model model) {
		List<Producto> productos = productoRepositorio.findByDescripcionContaining(descripcion);

		List<ProductoViewModel> productosvm = productos.stream().map(producto -> {
			ProductoViewModel vm = new ProductoViewModel();
			vm.setIdProducto(producto.getIdProducto());
			vm.setDescripcion(producto.getDescripcion());
			vm.setPrecio(producto.getPrecio());
			vm.setCantidad(producto.getCantidad());
			vm.setFechaVencimiento(producto.getFechaVencimiento());
			Categoria categoria = categoriaRepositorio.findById(producto.getCategoria().getIdCategoria()).orElse(null);
			if (categoria != null) {
				vm.setDescripcionCategoria(categoria.getDescripcionCategoria());
			}
			return vm;
		}).collect(Collectors.toList());

		model.addAttribute("productos", productosvm);

		return "consulta";
	}
}
