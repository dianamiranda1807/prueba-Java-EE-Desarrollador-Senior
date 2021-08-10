package empresas.transporte.prueba.Controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import empresas.transporte.prueba.Entity.Empresa;
import empresas.transporte.prueba.Service.EmpresaService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")

public class EmpresaController {
	@Autowired
	EmpresaService empresaService;
	
	@PostMapping("/empresa")
	public Empresa guardarEmpresa(@RequestBody Empresa empresa) {
		return this.empresaService.guardarEmpresa(empresa);
	}
	
}
