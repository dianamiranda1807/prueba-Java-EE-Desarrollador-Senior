package empresas.transporte.prueba.Repository;

import org.springframework.data.repository.CrudRepository;

import empresas.transporte.prueba.Entity.Empresa;

public interface EmpresaRepositorio extends CrudRepository< Empresa, Long> {

}
