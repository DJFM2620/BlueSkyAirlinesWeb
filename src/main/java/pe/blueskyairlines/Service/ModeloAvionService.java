package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.ModeloAvion;

public interface ModeloAvionService {

	public abstract void Insert (ModeloAvion modeloAvion);
	public abstract void Update (ModeloAvion modeloAvion);
	public abstract void Delete (Integer ID);
	public abstract ModeloAvion FindByID(Integer ID);
	public abstract Collection<ModeloAvion> FindAll();
}
