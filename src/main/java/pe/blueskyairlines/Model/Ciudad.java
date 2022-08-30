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
@Table(name = "Ciudad")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ciudadid;

	@Column(length = 15)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "paisid", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(paisid) references pais(paisid)"))
	private Pais pais;
	
	@OneToMany(mappedBy = "ciudad")
	private Collection<Aeropuerto> itemsaeropuerto = new ArrayList<>();
	
	public Ciudad() {
	}

	public Ciudad(Integer ciudadid, String nombre, Pais pais, Collection<Aeropuerto> itemsaeropuerto) {
		super();
		this.ciudadid = ciudadid;
		this.nombre = nombre;
		this.pais = pais;
		this.itemsaeropuerto = itemsaeropuerto;
	}

	public Integer getCiudadid() {
		return ciudadid;
	}

	public void setCiudadid(Integer ciudadid) {
		this.ciudadid = ciudadid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void setItemsaeropuerto(Collection<Aeropuerto> itemsaeropuerto) {
		this.itemsaeropuerto = itemsaeropuerto;
	}
}