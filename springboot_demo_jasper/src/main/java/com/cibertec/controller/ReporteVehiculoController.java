package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cibertec.entity.Vehiculo;
import com.cibertec.repository.IVehiculoRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Controller
public class ReporteVehiculoController {

	@Autowired
	private IVehiculoRepository servicioVehiculo;

	@GetMapping("/")
	public String mostrarListado(Model model) {
		List<Vehiculo> vehiculos = servicioVehiculo.findAll();
		model.addAttribute("vehiculos", vehiculos);
		return "listado";
	}

	@GetMapping("/reporte")
	public void generarReporteVehiculos(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Vehiculo> vehiculos = servicioVehiculo.findAll();

		JasperReport jasperReport = (JasperReport) JRLoader
				.loadObjectFromFile("src/main/resources/reports/reporte_vehiculos.jasper");
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(vehiculos);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

		// Configurar la respuesta HTTP para mostrar el informe en el navegador
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "inline; filename=reporte_vehiculos.pdf");

		// Escribir el informe en el flujo de salida de la respuesta
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());

	}
}
