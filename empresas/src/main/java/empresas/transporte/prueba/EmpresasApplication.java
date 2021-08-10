package empresas.transporte.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"empresas.transporte.prueba.Controller"})
public class EmpresasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresasApplication.class, args);
	}

}
