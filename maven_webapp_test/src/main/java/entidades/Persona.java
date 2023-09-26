package entidades;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idpersona;
	private String apellidos;
	private String nombres;
	private String direccion;
	private int distrito;	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanacimiento;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public int getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getDistrito() {
		return distrito;
	}


	public void setDistrito(int distrito) {
		this.distrito = distrito;
	}


	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", apellidos=" + apellidos + ", nombres=" + nombres + ", direccion="
				+ direccion + ", distrito=" + distrito + ", fechanacimiento=" + fechanacimiento + "]";
	}	
	
	
	
	
}
