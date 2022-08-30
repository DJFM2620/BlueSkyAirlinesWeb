package pe.blueskyairlines.Service;

import java.util.Collection;

import pe.blueskyairlines.Model.Ticket;

public interface TicketService {

	public abstract void Insert (Ticket ticket);
	public abstract void Update (Ticket ticket);
	public abstract void Delete (Integer ID);
	public abstract Ticket FindByID(Integer ID);
	public abstract Collection<Ticket> FindAll();
}
