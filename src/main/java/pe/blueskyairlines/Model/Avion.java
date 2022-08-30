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
@Table(name = "aviones")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AvionID;


	@Column
	private Integer Capacidad;
	@Column
	private String Matricula;
	@Column(columnDefinition = "longblob")
	private byte[] imagen;
	
	
	@ManyToOne
	@JoinColumn(name = "FabricanteID", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (FabricanteID) references fabricantes(FabricanteID)"))
	private FabricanteAvion fabricante; 
	@ManyToOne
	@JoinColumn(name = "ModeloID", nullable = false,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (ModeloID) references modelos(ModeloID)"))
	private ModeloAvion modelo;
	
	@OneToMany(mappedBy = "avion")
	private Collection<Vuelo> itemsVuelo = new ArrayList<>();
	
	
	
	
	public Avion() {
		// TODO Auto-generated constructor stub
	}




	public Avion(Integer avionID, Integer capacidad, String matricula, byte[] imagen, FabricanteAvion fabricante,
			ModeloAvion modelo, Collection<Vuelo> itemsVuelo) {
		super();
		AvionID = avionID;
		Capacidad = capacidad;
		Matricula = matricula;
		this.imagen = imagen;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.itemsVuelo = itemsVuelo;
	}




	public Integer getAvionID() {
		return AvionID;
	}




	public void setAvionID(Integer avionID) {
		AvionID = avionID;
	}




	public Integer getCapacidad() {
		return Capacidad;
	}




	public void setCapacidad(Integer capacidad) {
		Capacidad = capacidad;
	}




	public String getMatricula() {
		return Matricula;
	}




	public void setMatricula(String matricula) {
		Matricula = matricula;
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




	public Collection<Vuelo> getItemsVuelo() {
		return itemsVuelo;
	}




	public void setItemsVuelo(Collection<Vuelo> itemsVuelo) {
		this.itemsVuelo = itemsVuelo;
	}
	




	



}
