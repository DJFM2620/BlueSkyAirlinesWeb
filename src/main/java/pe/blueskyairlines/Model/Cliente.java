package pe.blueskyairlines.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteid;
	
	@Column(length = 20)
	private String nombre;
	
	@Column(length = 20)
	private String apellidop;
	
	@Column(length = 20)
	private String apellidom;
	
	@Column(length = 25)
	private String celular;
	
	@Column(length = 30)
	private String email;
	
	@Column(length = 15)
	private String pasaporte;
	
	public Cliente() {
	}

	public Cliente(Integer clienteid, String nombre, String apellidop, String apellidom, String celular, String email,
			String pasaporte) {
		
		this.clienteid = clienteid;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.celular = celular;
		this.email = email;
		this.pasaporte = pasaporte;
	}

	public Integer getClienteid() {
		return clienteid;
	}

	public void setClienteid(Integer clienteid) {
		this.clienteid = clienteid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
}
