package empresas.transporte.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import empresas.transporte.prueba.Entity.Empresa;
import empresas.transporte.prueba.Repository.EmpresaRepositorio;

@Service
public class EmpresaService {
	
	@Autowired
    private EmpresaRepositorio repository;
	
	public Empresa guardarEmpresa(Empresa Empresa) {
        return repository.save(Empresa);
    }
}
