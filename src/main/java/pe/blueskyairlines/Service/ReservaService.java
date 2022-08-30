package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Reserva;

public interface ReservaService {

	public abstract void Insert (Reserva reserva);
	public abstract void Update (Reserva reserva);
	public abstract void Delete (Integer ID);
	public abstract Reserva FindByID(Integer ID);
	public abstract Collection<Reserva> FindAll();
}
