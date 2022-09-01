package pe.blueskyairlines.Model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteid;

	@Column(length = 20)
	private String nombre;

	@Column(length = 20)
	private String apellidoP;

	@Column(length = 20)
	private String apellidoM;

	@Column(length = 15)
	private String celular;

	@Column(length = 30)
	private String email;

	@Column(length = 15)
	private String pasaporte;

	@ManyToOne
	@JoinColumn(name = "paisid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(paisid) references pais(paisid)"))
	private Pais pais;

	@OneToMany(mappedBy = "cliente")
	private Collection<Reserva> itemsreserva = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(Integer clienteid, String nombre, String apellidoP, String apellidoM, String celular, String email,
			String pasaporte, Pais pais, Collection<Reserva> itemsreserva) {
		super();
		this.clienteid = clienteid;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.celular = celular;
		this.email = email;
		this.pasaporte = pasaporte;
		this.pais = pais;
		this.itemsreserva = itemsreserva;
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

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Collection<Reserva> getItemsreserva() {
		return itemsreserva;
	}

	public void setItemsreserva(Collection<Reserva> itemsreserva) {
		this.itemsreserva = itemsreserva;
	}
}