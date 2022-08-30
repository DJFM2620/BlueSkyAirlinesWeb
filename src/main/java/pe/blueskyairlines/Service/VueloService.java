package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Vuelo;

public interface VueloService {

	public abstract void Insert (Vuelo vuelo);
	public abstract void Update (Vuelo vuelo);
	public abstract void Delete (Integer ID);
	public abstract Vuelo FindByID(Integer ID);
	public abstract Collection<Vuelo> FindAll();
}
