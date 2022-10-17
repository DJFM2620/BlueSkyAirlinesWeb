package pe.blueskyairlines.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.query.Param;

import pe.blueskyairlines.Model.Vuelo;

public interface VueloService {

	public abstract void Insert (Vuelo vuelo);
	public abstract void Update (Vuelo vuelo);
	public abstract void Delete (Integer ID);
	public abstract Vuelo FindByID(Integer ID);
	public abstract Collection<Vuelo> FindAll();
	
	public abstract Collection<Vuelo> VuelosPorCiudad(@Param("ciudadid")Integer ID);
	public abstract List<Object[]> VuelosPorAñoMes(@Param("Año") Integer Año, @Param("Mes") Integer Mes);
	public abstract Integer CantidadVuelos();
}
