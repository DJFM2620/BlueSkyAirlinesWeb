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
@Table(name = "Avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer avionid;

	@Column
	private Integer capacidad;
	
	@Column(length = 10)
	private String matricula;
	
	@Column(columnDefinition = "longblob")
	private byte[] imagen;
	
	@ManyToOne
	@JoinColumn(name = "fabricanteid", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (fabricanteid) references fabricante_avion(fabricanteid)"))
	private FabricanteAvion fabricante;
	
	@ManyToOne
	@JoinColumn(name = "modeloid", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (modeloid) references modelo_avion(modeloid)"))
	private ModeloAvion modelo;
	
	@OneToMany(mappedBy = "avion")
	private Collection<Vuelo> itemsVuelo = new ArrayList<>();	
	
	public Avion() {
	}

	public Avion(Integer avionid, Integer capacidad, String matricula, byte[] imagen, FabricanteAvion fabricante,
			ModeloAvion modelo, Collection<Vuelo> itemsVuelo) {
		super();
		this.avionid = avionid;
		this.capacidad = capacidad;
		this.matricula = matricula;
		this.imagen = imagen;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.itemsVuelo = itemsVuelo;
	}

	public Integer getAvionid() {
		return avionid;
	}

	public void setAvionid(Integer avionid) {
		this.avionid = avionid;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public FabricanteAvion getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteAvion fabricante) {
		this.fabricante = fabricante;
	}

	public ModeloAvion getModelo() {
		return modelo;
	}

	public void setModelo(ModeloAvion modelo) {
		this.modelo = modelo;
	}

	public void setItemsVuelo(Collection<Vuelo> itemsVuelo) {
		this.itemsVuelo = itemsVuelo;
	}
}