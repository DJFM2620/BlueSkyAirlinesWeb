package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Aeropuerto;

public interface AeropuertoService {

	public abstract void Insert (Aeropuerto aeropuerto);
	public abstract void Update (Aeropuerto aeropuerto);
	public abstract void Delete (Integer ID);
	public abstract Aeropuerto FindByID(Integer ID);
	public abstract Collection<Aeropuerto> FindAll();
}
