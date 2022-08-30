package pe.blueskyairlines.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoriaAsiento")
public class CategoriaAsiento {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CategoriaID;

	@Column
	private String Nombre;


	public CategoriaAsiento() {
		// TODO Auto-generated constructor stub
	}


	public CategoriaAsiento(Integer categoriaID, String nombre) {
		super();
		CategoriaID = categoriaID;
		Nombre = nombre;
	}


	public Integer getCategoriaID() {
		return CategoriaID;
	}


	public void setCategoriaID(Integer categoriaID) {
		CategoriaID = categoriaID;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}



}

