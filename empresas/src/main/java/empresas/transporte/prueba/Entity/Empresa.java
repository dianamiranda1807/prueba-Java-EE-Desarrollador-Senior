package empresas.transporte.prueba.Entity;

//import java.security.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TB_EMPRESA")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_empresa;
	private String tipo_identificacion_empresa;
	private String numero_identificacion_empresa;
	private String nombre_empresa;
	private String direccion_empresa;
	private String pais_empresa;
	private String departamento_empresa;
	private String ciudad_empresa;
	private String telefono_empresa;
	private String tipo_identificacion_representante;
	private String numero_identificacion_representante;
	private String nombre_representante;
	private String direccion_representante;
	private String pais_representante;
	private String departamento_representante;
	private String ciudad_representante;
	private String telefono_representante;
	@Column(columnDefinition="boolean default true")
	private Boolean  estado_linea;
	/*@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp  fecha_creacion;*/
	
	public Empresa() {
		
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getTipo_identificacion_empresa() {
		return tipo_identificacion_empresa;
	}

	public void setTipo_identificacion_empresa(String tipo_identificacion_empresa) {
		this.tipo_identificacion_empresa = tipo_identificacion_empresa;
	}

	public String getNumero_identificacion_empresa() {
		return numero_identificacion_empresa;
	}

	public void setNumero_identificacion_empresa(String numero_identificacion_empresa) {
		this.numero_identificacion_empresa = numero_identificacion_empresa;
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public String getDireccion_empresa() {
		return direccion_empresa;
	}

	public void setDireccion_empresa(String direccion_empresa) {
		this.direccion_empresa = direccion_empresa;
	}

	public String getPais_empresa() {
		return pais_empresa;
	}

	public void setPais_empresa(String pais_empresa) {
		this.pais_empresa = pais_empresa;
	}

	public String getDepartamento_empresa() {
		return departamento_empresa;
	}

	public void setDepartamento_empresa(String departamento_empresa) {
		this.departamento_empresa = departamento_empresa;
	}

	public String getCiudad_empresa() {
		return ciudad_empresa;
	}

	public void setCiudad_empresa(String ciudad_empresa) {
		this.ciudad_empresa = ciudad_empresa;
	}

	public String getTelefono_empresa() {
		return telefono_empresa;
	}

	public void setTelefono_empresa(String telefono_empresa) {
		this.telefono_empresa = telefono_empresa;
	}

	public String getTipo_identificacion_representante() {
		return tipo_identificacion_representante;
	}

	public void setTipo_identificacion_representante(String tipo_identificacion_representante) {
		this.tipo_identificacion_representante = tipo_identificacion_representante;
	}

	public String getNumero_identificacion_representante() {
		return numero_identificacion_representante;
	}

	public void setNumero_identificacion_representante(String numero_identificacion_representante) {
		this.numero_identificacion_representante = numero_identificacion_representante;
	}

	public String getNombre_representante() {
		return nombre_representante;
	}

	public void setNombre_representante(String nombre_representante) {
		this.nombre_representante = nombre_representante;
	}

	public String getDireccion_representante() {
		return direccion_representante;
	}

	public void setDireccion_representante(String direccion_representante) {
		this.direccion_representante = direccion_representante;
	}

	public String getPais_representante() {
		return pais_representante;
	}

	public void setPais_representante(String pais_representante) {
		this.pais_representante = pais_representante;
	}

	public String getDepartamento_representante() {
		return departamento_representante;
	}

	public void setDepartamento_representante(String departamento_representante) {
		this.departamento_representante = departamento_representante;
	}

	public String getCiudad_representante() {
		return ciudad_representante;
	}

	public void setCiudad_representante(String ciudad_representante) {
		this.ciudad_representante = ciudad_representante;
	}

	public String getTelefono_representante() {
		return telefono_representante;
	}

	public void setTelefono_representante(String telefono_representante) {
		this.telefono_representante = telefono_representante;
	}

	public Boolean getEstado_linea() {
		return estado_linea;
	}

	public void setEstado_linea(Boolean estado_linea) {
		this.estado_linea = estado_linea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_empresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id_empresa, other.id_empresa);
	}

	@Override
	public String toString() {
		return "Empresa [id_empresa=" + id_empresa + ", tipo_identificacion_empresa=" + tipo_identificacion_empresa
				+ ", numero_identificacion_empresa=" + numero_identificacion_empresa + ", nombre_empresa="
				+ nombre_empresa + ", direccion_empresa=" + direccion_empresa + ", pais_empresa=" + pais_empresa
				+ ", departamento_empresa=" + departamento_empresa + ", ciudad_empresa=" + ciudad_empresa
				+ ", telefono_empresa=" + telefono_empresa + ", tipo_identificacion_representante="
				+ tipo_identificacion_representante + ", numero_identificacion_representante="
				+ numero_identificacion_representante + ", nombre_representante=" + nombre_representante
				+ ", direccion_representante=" + direccion_representante + ", pais_representante=" + pais_representante
				+ ", departamento_representante=" + departamento_representante + ", ciudad_representante="
				+ ciudad_representante + ", telefono_representante=" + telefono_representante + ", estado_linea="
				+ estado_linea + "]";
	}
	
	
}
